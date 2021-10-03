package Umut.Library.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "types")
@NoArgsConstructor
public class Typee {
    public Typee(String name){
        this.name=name;
    }
    @Id
    private String id;
    private String name;
}
