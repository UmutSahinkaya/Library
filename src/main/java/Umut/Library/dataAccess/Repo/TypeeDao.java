package Umut.Library.dataAccess.Repo;

import Umut.Library.entities.Typee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeeDao extends MongoRepository<Typee,String> {
    @Override
    Optional<Typee> findById(String id);
}
