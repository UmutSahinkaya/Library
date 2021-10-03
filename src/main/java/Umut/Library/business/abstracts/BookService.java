package Umut.Library.business.abstracts;

import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.entities.Book;

import java.util.List;

public interface BookService {
    DataResult<List<Book>> getAll();

    Result add(Book book);

    DataResult<Book> getById(String id);

    DataResult<List<Book>> search(String search);
}
