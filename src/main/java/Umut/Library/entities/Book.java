package Umut.Library.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
@NoArgsConstructor
public class Book {
    public Book(String name, int pageSize, Author author, Typee typee){
        this.name=name;
        this.pageSize=pageSize;
        this.author=author;
        this.typee=typee;
    }

    @Id
    private String id;
    private String name;
    private int pageSize;
    private Author author;
    private Typee typee;
}
