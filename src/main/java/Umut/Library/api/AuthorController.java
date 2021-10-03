package Umut.Library.api;

import Umut.Library.business.abstracts.AuthorService;
import Umut.Library.core.constants.Messages;
import Umut.Library.core.utilities.results.DataResult;
import Umut.Library.core.utilities.results.SuccessDataResult;
import Umut.Library.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors/")
public class AuthorController {

    private AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @GetMapping("getall")
    public DataResult<List<Author>>getall(){
        return this.authorService.getAll();
    }



}
