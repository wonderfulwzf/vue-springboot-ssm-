package com.wzf.ssm.controller;

import com.wzf.ssm.error.BusinessException;
import com.wzf.ssm.error.EnumBusinessError;
import com.wzf.ssm.response.CommentReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/9/20,10:22
 */
public class BaseController {

    public static final String CONTENT_TYPE_FORMED="application/x-www-form-urlencoded";

    //定义exceptionhandle解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception ex){
        Map<String,Object> responseData = new HashMap<>(16);
        if(ex instanceof BusinessException){
            //取出异常中需要展示的数据
            BusinessException businessException = (BusinessException) ex;
            responseData.put("error",businessException.getErrorCode());
            responseData.put("errorMsg",businessException.getErrorMessage());
        }else {
            responseData.put("error", EnumBusinessError.UNKNOWN_ERROR.getErrorCode());
            responseData.put("errorMsg",EnumBusinessError.UNKNOWN_ERROR.getErrorMessage());
        }
        return CommentReturnType.create("fail",responseData);
    }
}
