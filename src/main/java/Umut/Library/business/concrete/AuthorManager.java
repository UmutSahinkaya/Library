package Umut.Library.business.concrete;

import Umut.Library.business.abstracts.AuthorService;
import Umut.Library.core.constants.Messages;
import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.core.utilities.results.SuccessDataResult;
import Umut.Library.core.utilities.results.SuccessResult;
import Umut.Library.dataAccess.Repo.AuthorDao;
import Umut.Library.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorManager implements AuthorService {
    private AuthorDao authorDao;

    @Autowired
    public AuthorManager(AuthorDao authorDao){
        this.authorDao=authorDao;
    }

    @Override
    public DataResult<List<Author>> getAll() {
        return new SuccessDataResult<>(authorDao.findAll(), Messages.AuthorsListed);
    }

    @Override
    public Result add(Author author) {
        // İş kuralı ekleyemedim .:(
        this.authorDao.save(author);
        return new SuccessResult(Messages.AuthorAdded);
    }

    @Override
    public DataResult<Author> getById(String id) {
        return new SuccessDataResult<Author>(authorDao.findById(id).get(),Messages.AuthorListed);
    }
}
