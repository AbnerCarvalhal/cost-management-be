package cost.management.service;

import java.util.List;

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
	public Commessa addCommessa(Commessa commessa, String ragioneSociale) {
		
		Cliente cliente = clienteService.findByRagioneSocialeContaining(ragioneSociale).get(0);
		System.out.println("CLIENTE FROM RAGIONE SOCIALE "+ cliente.getRagioneSociale());
		commessa.setCliente(cliente);
		
		return commessaRepo.save(commessa);
	}
	
	public List<Commessa> findAllCommesse(){
		return commessaRepo.findAll();
	}

}
