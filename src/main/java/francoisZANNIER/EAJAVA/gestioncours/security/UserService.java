package francoisZANNIER.EAJAVA.gestioncours.security;

import francoisZANNIER.EAJAVA.gestioncours.DAO.UtilisateurDao;
import francoisZANNIER.EAJAVA.gestioncours.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UtilisateurDao utilisateurDao;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Utilisateur> optionalUtilisateur = utilisateurDao.findByEmail(email);
        if (optionalUtilisateur.isPresent()) {
            return new User(optionalUtilisateur.get());

        }
        throw new UsernameNotFoundException("Email introuvable");
    }
}
