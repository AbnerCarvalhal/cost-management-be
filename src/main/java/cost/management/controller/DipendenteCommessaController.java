package cost.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cost.management.entities.DipendenteCommessa;
import cost.management.service.DipendenteCommessaService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class DipendenteCommessaController {

	@Autowired
	private DipendenteCommessaService dipCommService;
	

	@PostMapping("/dipendentecommessa/{importo}" )
	public DipendenteCommessa addDipendenteCommessa(@RequestBody DipendenteCommessa dipCommessa,
			@PathVariable String importo ) {
		//@PathVariable String commessaCodice, @PathVariable String dipendenteCF
		//{commessaCodice}/{dipendenteCF}
		//DipendenteCommessa dipCommessa = new DipendenteCommessa();
		System.out.println("INSIDE CONTROLLER&&&&&&&&&&&&&&&&");
		//System.out.println("DIPENDENTE COMMESSA CODICE :"+ dipCommessa.getCommessa().getCodice() );
		//System.out.println("DIPEENDENTE COMMESSA DIPENDENTE :"+ dipCommessa.getDipendente().getCodiceFiscale());
		System.out.println("DIP COMMESSA IMPORTO :"+ importo);
		//System.out.println("DIP COMMESSA DATA INIZIO ATTIVITA :"+ dipCommessa.getDataInizioAttivita());
		//System.out.println("DIP COMMESSA DATA FINE ATTIVITA :"+ dipCommessa.getDataFineAttivita());
		System.out.println("ID DIP COMMESSA :"+ dipCommessa.getId().getCommessaCodice());
		
		
		//System.out.println("OGGETTO DIPEDNETECOMEESSa id !@@@@@@: "+ dipCommessa.getId());
		//System.out.println("OGGETTO DIPEDNETECOMEESSa id -CODICE COMMESSA !@@@@@@: "+ dipCommessa.getId().getCommessaCodice());

		//System.out.println("OGGETTO DIPEDNETECOMEESSA ID - dipendente CF: "+ dipCommessa.getId().getDipendenteCodiceFiscale().toString());

		return dipCommService.addDipendenteCommessa(dipCommessa);
	}
	
//	@PostMapping(value="/dipendentecommessa/{dipendenteid}/{commessaid}" ,consumes={"application/json"})
//	public DipendenteCommessa addDipendenteCommessa(@RequestBody DipendenteCommessa dipCommessa,
//			@PathVariable("dipendenteid") String dipendenteid, @PathVariable("commessaid") String commessaid) {
//		//DipendenteCommessa dipCommessa = new DipendenteCommessa();
//		System.out.println("INSIDE CONTROLLER&&&&&&&&&&&&&&&&");
//		System.out.println("DIPENDENTE ID :" + dipendenteid);
//		System.out.println("OGGETTO DIPEDNETECOMEESSA CODICE FISCALE !@@@@@@: "+ dipCommessa.getId().getDipendenteCodiceFiscale().toString());
//		System.out.println("OGGETTO DIPEDNETECOMEESSA CODICE COMMESSA !@@@@@@: "+ dipCommessa.getId().getCommessaCodice().toString());
//
//		return dipCommService.addDipendenteCommessa(dipCommessa, dipendenteid, commessaid);
//	}

}
