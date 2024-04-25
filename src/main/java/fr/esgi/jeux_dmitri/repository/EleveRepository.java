package fr.esgi.jeux_dmitri.repository;

import fr.esgi.jeux_dmitri.business.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
}