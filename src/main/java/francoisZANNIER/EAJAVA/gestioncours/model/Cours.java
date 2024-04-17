package francoisZANNIER.EAJAVA.gestioncours.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cours {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToOne
    private TypeCours typeCours;


}
