package fr.esgi.jeux_dmitri.business;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Multiplication extends Jeu {

    private int nombre1;
    private int nombre2;
    private int response;

}
