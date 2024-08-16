package backend.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "form_submit")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formId;

    private String name;
    private String email;

    @Column(length = 200, nullable = false)
    private String message;
}
