package francoisZANNIER.EAJAVA.gestioncours.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String prenom;

    public enum Role{
        eleve,
        professeur
    }

    protected boolean admin;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('responsable site','gestionnaire matériel')")
    private Role role;

    protected String motDePasse;

    protected String email;

}

