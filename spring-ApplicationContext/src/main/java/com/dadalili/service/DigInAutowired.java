package com.dadalili.service;

import com.dadalili.vo.Bean1;
import com.dadalili.vo.Bean2;
import com.dadalili.vo.Bean3;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.InjectionMetadata;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.core.MethodParameter;
import org.springframework.core.env.StandardEnvironment;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author caoqian
 * @since 2023/2/25 14:35
 */
public class DigInAutowired {

    //AutowiredAnnotationBeanPostProcessor 运行分析
    public static void main(String[] args) throws Throwable {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("Bean2",new Bean2());
        factory.registerSingleton("Bean3",new Bean3());
        factory.setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());//解析@Value注解
        factory.addEmbeddedValueResolver(new StandardEnvironment()::resolvePlaceholders);// ${} 的解析

        //查找哪些属性添加了Autowired注解
        AutowiredAnnotationBeanPostProcessor processor = new AutowiredAnnotationBeanPostProcessor();
        processor.setBeanFactory(factory);

        Bean1 bean1 = new Bean1();
//        System.out.println(bean1);
//        //执行后处理器依赖注入 @Autowired @Value
//        processor.postProcessProperties(null,bean1,"Bean1");
//        System.out.println(bean1);

        Method findAutowiringMetadata = AutowiredAnnotationBeanPostProcessor.class.getDeclaredMethod("findAutowiringMetadata", String.class, Class.class, PropertyValues.class);
        findAutowiringMetadata.setAccessible(true);
        InjectionMetadata metaData = (InjectionMetadata) findAutowiringMetadata.invoke(processor, "bean1", Bean1.class, null);
        System.out.println(metaData);

        //调用InjectionMetadata 进行依赖注入 注入时按照类型查找值
        metaData.inject(bean1,"bean1",null);
        System.out.println(bean1);


        //根据方法参数查找已经注入的值
        Method setHome = Bean1.class.getDeclaredMethod("setHome", String.class);
        DependencyDescriptor descriptor = new DependencyDescriptor(new MethodParameter(setHome, 0), false);
        Object setHomeBean = factory.doResolveDependency(descriptor,null,null,null);
        System.out.println(setHomeBean);

        //根据方法参数查找已经注入的Bean
        Field field = Bean1.class.getDeclaredField("bean3");
        DependencyDescriptor descriptor1 = new DependencyDescriptor(field, false);
        Object Bean3 = factory.doResolveDependency(descriptor1, null, null, null);
        System.out.println(Bean3);


        //根据方法名字查找注入的Bean
        Method setBean2 = Bean1.class.getDeclaredMethod("setBean2", Bean2.class);
        DependencyDescriptor descriptor2 = new DependencyDescriptor(new MethodParameter(setBean2, 0), false);
        Object setBean2Object = factory.doResolveDependency(descriptor2, null, null, null);
        System.out.println(setBean2Object);
    }

}
