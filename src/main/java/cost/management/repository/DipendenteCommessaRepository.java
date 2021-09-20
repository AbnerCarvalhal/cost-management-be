package cost.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cost.management.entities.DipendenteCommessa;
import cost.management.entities.DipendenteCommessaPK;

@Repository
public interface DipendenteCommessaRepository extends JpaRepository<DipendenteCommessa, DipendenteCommessaPK>{

	
}
