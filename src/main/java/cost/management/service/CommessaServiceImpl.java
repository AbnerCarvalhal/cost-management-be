package cost.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cost.management.entities.Cliente;
import cost.management.entities.Commessa;
import cost.management.repository.CommessaRepository;

@Service
public class CommessaServiceImpl implements CommessaService {
	
	@Autowired
	private CommessaRepository commessaRepo;
	
	@Autowired
	private ClienteService clienteService;
	
	
	@Override
	public Commessa addCommessa(Commessa commessa, String id) {
		Cliente cliente = clienteService.findByPartitaIva(id);
		commessa.setCliente(cliente);
		
		
		return commessaRepo.save(commessa);
	}

}
