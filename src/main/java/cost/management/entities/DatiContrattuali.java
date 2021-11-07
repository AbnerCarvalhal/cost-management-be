package cost.management.entities;

import java.util.ArrayList;
import java.util.List;

public class DatiContrattuali {
	
	private String codiceFiscale;
	
	private String azienda;
	
	private String nome;
	
	private String cognome;
	
	
	public DatiContrattuali() {
	}

	public DatiContrattuali(String codiceFiscale, String azienda, String nome, String cognome) {
		this.codiceFiscale = codiceFiscale;
		this.azienda = azienda;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	

}
