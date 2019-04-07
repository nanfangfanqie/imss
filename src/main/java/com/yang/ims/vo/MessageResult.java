package com.yang.ims.vo;

/**
 * @author yangchen
 * on 2019/4/7 16:10
 */
public class MessageResult {
    private boolean status;
    private Object data;
    private String Message;

    public MessageResult(boolean status) {
        this.status = status;
    }

    public MessageResult(boolean status, Object data) {
        this.status = status;
        this.data = data;
    }

    public MessageResult(boolean status, String message) {
        this.status = status;
        Message = message;
    }

    public MessageResult(boolean status, Object data, String message) {
        this.status = status;
        this.data = data;
        Message = message;
    }

    @Override
    public String toString() {
        return "MessageResult{" +
                "status=" + status +
                ", data=" + data.toString() +
                ", Message='" + Message + '\'' +
                '}';
    }
}
