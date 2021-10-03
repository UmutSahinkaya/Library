package Umut.Library.business.abstracts;

import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.entities.Author;

import java.util.List;

public interface AuthorService {
    DataResult<List<Author>> getAll();
    Result add(Author author);
    DataResult<Author> getById(String id);

}
