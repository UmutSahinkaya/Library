package Umut.Library.business.concrete;

import Umut.Library.business.abstracts.TypeeService;
import Umut.Library.core.constants.Messages;
import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.core.utilities.results.SuccessDataResult;
import Umut.Library.core.utilities.results.SuccessResult;
import Umut.Library.dataAccess.Repo.TypeeDao;
import Umut.Library.entities.Typee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeManager implements TypeeService {
    private TypeeDao typeeDao;
    @Autowired
    public TypeManager(TypeeDao typeeDao){
        this.typeeDao=typeeDao;
    }
    @Override
    public DataResult<List<Typee>> getAll() {
        return new SuccessDataResult<List<Typee>>(this.typeeDao.findAll(), Messages.TypesListed);
    }

    @Override
    public Result add(Typee typee) {
        typeeDao.save(typee);
        return new SuccessResult(Messages.TypeAdded);
    }

    @Override
    public DataResult<Typee> getById(String id) {
        return new SuccessDataResult<Typee>(typeeDao.findById(id).get(),Messages.TypeListed);
    }
}
