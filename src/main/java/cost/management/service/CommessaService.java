package cost.management.service;

import java.util.List;

import cost.management.entities.Commessa;

public interface CommessaService {

	Commessa addCommessa(Commessa commessa, String ragioneSociale);
	
	List<Commessa> findAllCommesse();

}