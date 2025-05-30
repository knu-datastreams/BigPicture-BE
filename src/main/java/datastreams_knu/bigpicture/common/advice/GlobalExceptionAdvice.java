package datastreams_knu.bigpicture.common.advice;

import datastreams_knu.bigpicture.common.domain.ApiResponse;
import datastreams_knu.bigpicture.common.exception.ObjectMapperException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.UncheckedIOException;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ObjectMapperException.class)
    public ApiResponse<Object> objectMapperException(ObjectMapperException e) {
        return ApiResponse.of(
                HttpStatus.INTERNAL_SERVER_ERROR,
                e.getMessage()
        );
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class)
    public ApiResponse<Object> bindException(BindException e) {
        return ApiResponse.of(
                HttpStatus.BAD_REQUEST,
                e.getBindingResult().getAllErrors().get(0).getDefaultMessage()
        );
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ApiResponse<Object> illegalArgumentException(IllegalArgumentException e) {
        return ApiResponse.of(
                HttpStatus.BAD_REQUEST,
                e.getMessage()
        );
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UncheckedIOException.class)
    public ApiResponse<Object> uncheckedIOException(UncheckedIOException e) {
        return ApiResponse.of(
                HttpStatus.INTERNAL_SERVER_ERROR,
                e.getMessage()
        );
    }
}
