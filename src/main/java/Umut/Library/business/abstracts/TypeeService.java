package Umut.Library.business.abstracts;

import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.Result;
import Umut.Library.entities.Typee;

import java.util.List;

public interface TypeeService {
DataResult<List<Typee>> getAll();
Result add(Typee typee);
DataResult<Typee> getById(String id);
}
