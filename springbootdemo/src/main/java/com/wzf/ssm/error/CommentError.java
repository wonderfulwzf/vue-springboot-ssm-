package com.wzf.ssm.error;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,23:05
 */

/**
 * 通用枚举接口
 */
public interface CommentError {
    public int getErrorCode();
    public String getErrorMessage();
    public CommentError setErrorMessage(String message);
}
