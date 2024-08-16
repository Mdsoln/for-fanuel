package backend.demo.controller;

import backend.demo.service.impl.FormServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin()
@RestController
@RequestMapping(path = "/api/v1/user")
@RequiredArgsConstructor
public class FormSubmissionController {

    private final FormServiceImpl formService;

    @CrossOrigin()
    @PostMapping("/submit-form")
    public ResponseEntity<String> formSubmission(
            @RequestParam(name = "firstName", required = false) String firstName,
            @RequestParam(name = "lastName", required = false) String lastName,
            @RequestParam(name = "email", required = false) String email,
            @RequestParam(name = "message", required = false) String message
    ){
        return formService.formSubmission(firstName, lastName, email, message);
    }
}
