package com.dadalili.vo;

/**
 * @author caoqian
 * @since 2023/2/27 13:43
 */
public class Revert {
    private boolean status;
    private Object data;
    private String message;
    private int code;

    public Revert() {
    }

    private Revert(Revert.Builder builder) {
        this.setStatus(builder.status);
        this.setData(builder.data);
        this.setMessage(builder.message);
        this.setCode(builder.code);
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static final class Builder {
        private boolean status;
        private Object data;
        private String message;
        private int code;

        public Builder() {
        }

        public Revert.Builder status(boolean val) {
            this.status = val;
            return this;
        }

        public Revert.Builder data(Object val) {
            this.data = val;
            return this;
        }

        public Revert.Builder message(String val) {
            this.message = val;
            return this;
        }

        public Revert.Builder code(int val) {
            this.code = val;
            return this;
        }

        public Revert build() {
            return new Revert(this);
        }
    }
}
