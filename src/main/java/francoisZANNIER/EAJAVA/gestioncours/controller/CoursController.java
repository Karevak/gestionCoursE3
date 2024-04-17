package francoisZANNIER.EAJAVA.gestioncours.controller;

import francoisZANNIER.EAJAVA.gestioncours.DAO.CoursDao;
import francoisZANNIER.EAJAVA.gestioncours.model.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CoursController {

    @Autowired
    CoursDao coursDao;

    @GetMapping("/cours/liste")
    List<Cours> liste(){
        return coursDao.findAll();
    }

}
