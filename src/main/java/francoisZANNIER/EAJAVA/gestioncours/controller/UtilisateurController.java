package francoisZANNIER.EAJAVA.gestioncours.controller;

import francoisZANNIER.EAJAVA.gestioncours.DAO.UtilisateurDao;
import francoisZANNIER.EAJAVA.gestioncours.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UtilisateurController {

    @Autowired
    UtilisateurDao utilisateurDao;

    @GetMapping("/utilisateur/liste")
    List<Utilisateur> liste(){
        return utilisateurDao.findAll();
    }

}
