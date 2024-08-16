package backend.demo.service.impl;

import backend.demo.entity.Form;
import backend.demo.exception.NullValueException;
import backend.demo.repository.FormSubmissionRepo;
import backend.demo.service.FormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FormServiceImpl implements FormService {

    private final FormSubmissionRepo formRepository;

    @Override
    public ResponseEntity<String> formSubmission(String firstName, String lastName,
                                                 String email, String message)
    {
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()
                || email == null || email.isEmpty() || message == null || message.isEmpty()
        ){
            throw new NullValueException("All fields are required");
        }

        Form form = Form
                .builder()
                .name(firstName +" "+ lastName)
                .email(email)
                .message(message)
                .build();
        formRepository.save(form);

        return ResponseEntity.ok("Successfully");
    }
}
