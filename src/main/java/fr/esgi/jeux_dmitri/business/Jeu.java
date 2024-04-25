package fr.esgi.jeux_dmitri.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jeu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long          id;
    private LocalDateTime dateHeureEnvoi;
    private LocalDateTime dateHeureReponse;

    @ManyToOne
    private Eleve eleve;

}
