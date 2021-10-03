package Umut.Library.business.concrete;

import Umut.Library.business.abstracts.BookService;
import Umut.Library.core.constants.Messages;
import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.core.utilities.results.SuccessDataResult;
import Umut.Library.core.utilities.results.SuccessResult;
import Umut.Library.dataAccess.Repo.AuthorDao;
import Umut.Library.dataAccess.Repo.BookDao;
import Umut.Library.dataAccess.Repo.TypeeDao;
import Umut.Library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookManager implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private TypeeDao typeeDao;
    @Autowired
    public BookManager(BookDao bookDao,AuthorDao authorDao,TypeeDao typeeDao){
        this.bookDao=bookDao;
        this.authorDao=authorDao;
        this.typeeDao=typeeDao;
    }

    @Override
    public DataResult<List<Book>> getAll() {
        return new SuccessDataResult<>(bookDao.findAll(),Messages.BooksListed);
    }

    @Override
    public Result add(Book book) {
        bookDao.save(book);
        return new SuccessResult(Messages.BookAdded);
    }

    @Override
    public DataResult<Book> getById(String id) {
        return new SuccessDataResult<Book>(bookDao.findById(id).get(),Messages.BookListed);
    }

    @Override
    public DataResult<List<Book>> search(String search) {
        return null;
    }
}
