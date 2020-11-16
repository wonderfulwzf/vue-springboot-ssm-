package com.wzf.ssm.error;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,23:08
 */
public enum EnumBusinessError implements CommentError{
    //未知错误
    UNKNOWN_ERROR(20002,"未知错误"),
    PARAMETER_VALIDATION_ERROR(101,"参数不合法"),
    VIEW_NOT_FOUND(404,"页面找不到")
    ;
    private int errorCode;
    private String errorMessage;

    private EnumBusinessError(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMessage() {
        return this.getErrorMessage();
    }

    @Override
    public CommentError setErrorMessage(String message) {
        this.errorMessage = message;
        return this;
    }
}
