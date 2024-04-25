package fr.esgi.jeux_dmitri.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Quiz extends Jeu {

    @Id
    private Long id;

    private String reponse;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
