package fr.esgi.jeux_dmitri.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    private String lebelle;
    private String bonneReponse;

    @OneToMany(mappedBy = "question")
    private List<Quiz> quizzes;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

}
