package cost.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cost.management.entities.Commessa;
import cost.management.service.CommessaService;

@RestController("/api")
@CrossOrigin(origins="http://localhost:8080")
public class CommessaController {

	
	@Autowired
	private CommessaService commessaService;
	
	@PostMapping("/commesse")
	private Commessa addCommessa(@RequestBody Commessa commessa) {
		
		return commessaService.addCommessa(commessa);
		
	}
}
