package com.hebo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;

/**
 * Created by hebo on 2018/5/25.
 * 统一异常处理
 */
@ControllerAdvice
public class YimiExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(YimiExceptionHandler.class);


    @ExceptionHandler({YimiBizException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public MartiniResult bizHandler(YimiBizException ex) {
        return MartiniResult.buinessError(ex.getCode(), ex.getMessage());
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MartiniResult validHandler(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuilder errorMsg = new StringBuilder();
        List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
        if (!CollectionUtils.isEmpty(fieldErrorList)) {
            for (int i = 0; i < fieldErrorList.size(); i++) {
                errorMsg.append(fieldErrorList.get(i).getField()).append(":").append(fieldErrorList.get(i).getDefaultMessage());
                if (i != fieldErrorList.size() - 1) {
                    errorMsg.append("; ");
                }
            }
        }
        return MartiniResult.paramError(errorMsg.toString());
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public MartiniResult exceptionHandler(Exception ex) {
        String errCode = String.valueOf(new Date().getTime());
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
        logger.error(stack.toString());
        return MartiniResult.systemError(errCode);
    }
}
