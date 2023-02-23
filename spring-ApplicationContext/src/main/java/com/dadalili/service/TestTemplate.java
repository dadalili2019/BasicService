package com.dadalili.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caoqian
 * @since 2023/2/23 16:18
 */
public class TestTemplate {
    //模板方法


    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.addBeanProcessor(bean -> System.out.println("执行process..."));
        beanFactory.addBeanInit(bean -> System.out.println("执行BeanInit...."));
        beanFactory.getBean();
    }


    static class BeanFactory {
        public Object getBean() {
            Object o = new Object();
            System.out.println("方法1......");
            for (BeanProcessor processor : beanProcessorList) {
                processor.inject(o);
            }
            System.out.println("方法2......");
            for (BeanInit beanInit : beanInits) {
                beanInit.init(o);
            }
            return o;
        }

        private List<BeanProcessor> beanProcessorList = new ArrayList<BeanProcessor>();
        private List<BeanInit> beanInits = new ArrayList<BeanInit>();

        public void addBeanProcessor(BeanProcessor beanProcessor) {
            beanProcessorList.add(beanProcessor);
        }

        public void addBeanInit(BeanInit beanInit) {
            beanInits.add(beanInit);
        }
    }


    static interface BeanProcessor {
        public void inject(Object bean);//Bean后处理器扩展
    }


    static interface BeanInit {
        public void init(Object bean);//Bean初始化扩展....
    }
}
