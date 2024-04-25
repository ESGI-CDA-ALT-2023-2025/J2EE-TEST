package fr.esgi.jeux_dmitri.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Eleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long      id;
    private String    nom;
    private String    prenom;
    private LocalDate dateDeNaissance;
    private LocalDate dateHeureInscription;
    private String    email;
    @Size(min = 4)
    private String    motDePasse;

    @ManyToMany(
            mappedBy = "eleves"
    )
    private List<Groupe> groupes;
    @OneToMany(
            mappedBy = "eleve"
    )
    private List<Jeu>    jeux;
    @ManyToOne
    @NotNull
    @Column(nullable = false)
    private Niveau       niveau;

}
