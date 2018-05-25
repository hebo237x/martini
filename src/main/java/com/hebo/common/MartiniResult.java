package com.hebo.common;

/**
 * Created by hebo on 2018/4/2.
 * 统一返回
 */
public class MartiniResult<T> {

    private int code;

    private String message;

    private T data;

    public MartiniResult() {
    }

    public MartiniResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> MartiniResult success(T data) {
        return new MartiniResult(ErrorCodeEnum.SUCCESS.getCode(), ErrorCodeEnum.SUCCESS.getMessage(), data);
    }

    public static <T> MartiniResult systemError() {
        return new MartiniResult(ErrorCodeEnum.FAIL.getCode(), ErrorCodeEnum.FAIL.getMessage(), null);
    }

    public static <T> MartiniResult systemError(String errorCode) {
        return new MartiniResult(ErrorCodeEnum.FAIL.getCode(), "系统错误:["+errorCode+"]", null);
    }

    public static <T> MartiniResult paramError(String msg) {
        return new MartiniResult(ErrorCodeEnum.PARAMERROR.getCode(), "参数错误:["+msg+"]", null);
    }


    public static <T> MartiniResult buinessError(ErrorCodeEnum errorCodeEnum) {
        return new MartiniResult(errorCodeEnum.getCode(), errorCodeEnum.getMessage(), null);
    }

    public static <T> MartiniResult buinessError(int code,String message) {
        return new MartiniResult(code, message, null);
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
