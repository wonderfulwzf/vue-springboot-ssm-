package com.wzf.ssm.response;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,22:59
 */
public class CommentReturnType {
    /*
        返回的状态
        若status为success则data返回前端需要的json数据
        若status为fail,则打他内使用通用的错误码格式
     */
    private String status;
    /**
     * 返回的数据
     */
    private Object data;

    public static CommentReturnType create(Object data) {
       return CommentReturnType.create("success",data);
    }
    public static CommentReturnType create(String status, Object data) {
        CommentReturnType commentReturnType = new CommentReturnType();
        commentReturnType.setData(data);
        commentReturnType.setStatus(status);
        return commentReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CommentReturnType{");
        sb.append("status='").append(status).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
