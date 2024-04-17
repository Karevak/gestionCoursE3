package francoisZANNIER.EAJAVA.gestioncours.DAO;

import francoisZANNIER.EAJAVA.gestioncours.model.Cours;
import francoisZANNIER.EAJAVA.gestioncours.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursDao extends JpaRepository<Cours,Integer> {

}
