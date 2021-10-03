package Umut.Library.dataAccess.Repo;

import Umut.Library.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorDao extends MongoRepository<Author,String> {
    @Override
    Optional<Author>findById(String id);
}
