package cost.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cost.management.entities.Commessa;
import cost.management.entities.Dipendente;
import cost.management.entities.DipendenteCommessa;
import cost.management.repository.CommessaRepository;
import cost.management.repository.DipendenteCommessaRepository;
import cost.management.repository.DipendenteRepository;

@Service
public class DipendenteCommessaServiceImpl implements DipendenteCommessaService {
	
	@Autowired
	private DipendenteCommessaRepository dipCommRepo;
	
	@Autowired
	private CommessaRepository commessaRepo;
	
	@Autowired
	private DipendenteRepository dipendenteRepo;
	
	
	@Override
	public DipendenteCommessa addDipendenteCommessa(DipendenteCommessa dipendenteCommessa, String dipendenteid, String commessaid) {
		// TODO Auto-generated method stub
		Commessa commessa = commessaRepo.findById(commessaid).get();
		dipendenteCommessa.setCommessa(commessa);
		
		Dipendente dipendente  =dipendenteRepo.findById(dipendenteid).get();
		dipendenteCommessa.setDipendente(dipendente);
		return dipCommRepo.save(dipendenteCommessa);
		
	}
	
	

}
