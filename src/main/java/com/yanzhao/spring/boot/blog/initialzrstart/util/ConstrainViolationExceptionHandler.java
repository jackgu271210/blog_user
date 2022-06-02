package com.yanzhao.spring.boot.blog.initialzrstart.util;

import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

public class ConstrainViolationExceptionHandler {
    /**
     * 获取批量异常信息
     */
    public static String getMessage(ConstraintViolationException e) {
        List<String> msgList = new ArrayList<>();
        for (ConstraintViolationException<?> constraintViolationException : e.getConstraintViolations()) {
            msgList.add(constraintViolationException.getMessage());
        }
        String messages = StringUtils.join(msgList.toArray(), ";");
        return messages;
    }
}
