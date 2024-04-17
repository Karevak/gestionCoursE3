package francoisZANNIER.EAJAVA.gestioncours.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TypeCours {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    protected String nom;
}
