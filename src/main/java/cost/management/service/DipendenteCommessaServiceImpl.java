package cost.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cost.management.entities.Commessa;
import cost.management.entities.Dipendente;
import cost.management.entities.DipendenteCommessa;
import cost.management.entities.DipendenteCommessaPK;
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
	
//	@Autowired
//	private DipendenteCommessaPK dipPK;

	public DipendenteCommessa addDipendenteCommessa(DipendenteCommessa dipendenteCommessa) {
//		String CF = dipendenteCommessa.getDipendente().getCodiceFiscale();
//		String CC  = dipendenteCommessa.getCommessa().getCodice();
//		dipPK.setCommessaCodice(CC);
//		dipPK.setDipendenteCodiceFiscale(CF);
//		dipendenteCommessa.setId(dipPK);
		
		
		return dipCommRepo.save(dipendenteCommessa);
	}
	
	/*
	@Override
	public DipendenteCommessa addDipendenteCommessa(DipendenteCommessa dipendenteCommessa) {
		// TODO Auto-generated method stub
		Commessa commessa = commessaRepo.findById(commessaid).get();
		dipendenteCommessa.setCommessa(commessa);
		
		Dipendente dipendente  =dipendenteRepo.findById(dipendenteid).get();
		dipendenteCommessa.setDipendente(dipendente);
		System.out.println("SERVICE@@@@@@@ :"+dipendenteCommessa.getDipendente().getCodiceFiscale().toString());
		return dipCommRepo.save(dipendenteCommessa);
		
	}*/
	
	
	
	

}
