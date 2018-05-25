package com.hebo.common;

import java.io.Serializable;

/**
 * Created by hebo on 2018/5/25.
 * 业务异常类
 */
public class YimiBizException extends RuntimeException implements Serializable {
    private int code;

    public YimiBizException() {
    }

    public YimiBizException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.code = errorCodeEnum.getCode();
    }

    public YimiBizException(int code,String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
