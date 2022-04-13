package corso.java.spring.macchina.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Car")
public class Car {
    @Id
    private String targa;
    private String modello;
    private String marca;
    private int nRuote;
}
