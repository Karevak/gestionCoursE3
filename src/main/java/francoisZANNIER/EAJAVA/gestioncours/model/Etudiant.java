package francoisZANNIER.EAJAVA.gestioncours.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Etudiant extends Utilisateur{
    @ManyToMany
    @JoinTable(name="cours_utilisateur",inverseJoinColumns = @JoinColumn(name="cours_id"))

    protected List<Cours> listeCours;
}