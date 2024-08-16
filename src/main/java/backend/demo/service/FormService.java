package backend.demo.service;


import org.springframework.http.ResponseEntity;

public interface FormService {
    ResponseEntity<String> formSubmission(String firstName, String lastName, String email, String message);
}
