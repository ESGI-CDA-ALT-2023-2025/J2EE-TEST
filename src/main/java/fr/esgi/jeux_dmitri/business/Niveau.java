package fr.esgi.jeux_dmitri.business;

import fr.esgi.jeux_dmitri.business.enumeration.ENiveau;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Niveau {

    @Id
    private Long   id;
    private String nom;

    @OneToMany(mappedBy = "niveau")
    private List<Eleve> eleves;

    public static Niveau fromNiveau(Niveau niveau) {
        Niveau entity = new Niveau();
        entity.setNom(niveau.getNom());
        return entity;
    }

    public ENiveau toENiveau() {
        return ENiveau.valueOf(this.getNom());
    }
}
