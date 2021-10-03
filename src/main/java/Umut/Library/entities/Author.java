package Umut.Library.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "authors")
public class Author {

    public Author(String name) {
        this.name = name;
    }

    @Id
    private String id;

    private String name;
}
