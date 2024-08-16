package backend.demo.repository;

import backend.demo.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormSubmissionRepo extends JpaRepository<Form, Long> {

}
