package com.wzf.ssm.error;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,23:16
 */
public class BusinessException extends Exception implements CommentError {

    private CommentError commentError;

    public BusinessException(CommentError commentError){
        super();
        this.commentError = commentError;
    }
    public BusinessException(CommentError commentError,String message){
        super();
        this.commentError = commentError;
        this.commentError.setErrorMessage(message);
    }
    @Override
    public int getErrorCode() {
        return this.commentError.getErrorCode();
    }

    @Override
    public String getErrorMessage() {
        return this.commentError.getErrorMessage();
    }

    @Override
    public CommentError setErrorMessage(String message) {
        this.commentError.setErrorMessage(message);
        return this;
    }
}
