package corso.java.spring.boot.first.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "CompatDisk")
public class CompatDisk {
    @Id
    private String id;
    private String name;
    private String title;
    private String description;
    private String author;
    private int age;
}
