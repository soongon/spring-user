package com.example.springuser.exception;

import org.h2.jdbc.JdbcSQLSyntaxErrorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = JdbcSQLSyntaxErrorException.class)
    public String handleJSYEException(JdbcSQLSyntaxErrorException e) {
        return "데이터베이스 관련 에러가 발생했습니다.";
    }


    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) {
        return "알수없는 에러입니다.";
    }

}
