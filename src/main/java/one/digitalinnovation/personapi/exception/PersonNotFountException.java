package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFountException extends Exception {
    public PersonNotFountException(Long id) {
        super("Person not found with ID " + id);
    }
}
