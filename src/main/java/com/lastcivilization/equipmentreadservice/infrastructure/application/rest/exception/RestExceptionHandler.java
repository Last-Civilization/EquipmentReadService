package com.lastcivilization.equipmentreadservice.infrastructure.application.rest.exception;

import com.lastcivilization.equipmentreadservice.domain.exception.EquipmentNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(EquipmentNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    ErrorEntity handleEquipmentNotFoundException(EquipmentNotFoundException exception) {
        return new ErrorEntity(exception.getMessage());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(BAD_REQUEST)
    ErrorEntity handleConstraintViolationException(ConstraintViolationException exception) {
        return new ErrorEntity(exception.getMessage());
    }
}

