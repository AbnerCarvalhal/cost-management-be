package cost.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cost.management.entities.Commessa;
import cost.management.repository.CommessaRepository;

@Service
public class CommessaServiceImpl implements CommessaService {
	
	@Autowired
	private CommessaRepository commessaRepo;
	
	
	@Override
	public Commessa addCommessa(Commessa commessa) {
		
		
		return commessaRepo.save(commessa);
	}

}
