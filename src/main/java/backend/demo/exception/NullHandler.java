package backend.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NullHandler {

    @ExceptionHandler(value = {NullValueException.class})
    public ResponseEntity<Object> handleExceptions(NullValueException handleExceptions){
        FieldException exceptionFields = new FieldException(
                handleExceptions.getMessage(),
                handleExceptions.getCause(),
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(exceptionFields,HttpStatus.BAD_REQUEST);
    }
}
