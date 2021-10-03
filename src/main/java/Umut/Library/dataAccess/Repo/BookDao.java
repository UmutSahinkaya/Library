package Umut.Library.dataAccess.Repo;

import Umut.Library.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface BookDao extends MongoRepository<Book,String> {
    @Override
    Optional<Book> findById(String id);
}
