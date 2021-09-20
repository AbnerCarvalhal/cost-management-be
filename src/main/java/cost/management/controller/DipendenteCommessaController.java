package cost.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cost.management.entities.DipendenteCommessa;
import cost.management.service.DipendenteCommessaService;

@Controller
@RequestMapping("/api")
public class DipendenteCommessaController {

	@Autowired
	private DipendenteCommessaService dipCommService;

	@PostMapping("/dipendentecommessa/{dipendenteid}/{commessaid}")
	public DipendenteCommessa addDipendenteCommessa(@RequestBody DipendenteCommessa dipCommessa,
			@PathVariable("dipendenteid") String dipendenteid, @PathVariable("commessaid") String commessaid) {

		return dipCommService.addDipendenteCommessa(dipCommessa, dipendenteid, commessaid);
	}

}
