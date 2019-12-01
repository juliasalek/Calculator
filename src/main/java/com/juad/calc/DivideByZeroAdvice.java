package com.juad.calc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
class DivideByZeroAdvice {

    @ResponseBody
    @ExceptionHandler(DivideByZeroException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String divideByZeroHandler(DivideByZeroException exception) {
        return exception.getMessage();
    }
}
