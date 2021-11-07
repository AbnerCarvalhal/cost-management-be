package cost.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cost.management.entities.Commessa;

@Repository
public interface CommessaRepository extends JpaRepository<Commessa, String> {

}
