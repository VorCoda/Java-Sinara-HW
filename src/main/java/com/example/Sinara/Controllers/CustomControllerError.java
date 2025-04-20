package com.example.Sinara.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

//Обрабатывает все контроллеры на исключение
@ControllerAdvice
public class CustomControllerError {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> exception (Exception ex, WebRequest request){
        return  new ResponseEntity<>("Custom 502 Error", HttpStatus.BAD_GATEWAY);
    }
}
