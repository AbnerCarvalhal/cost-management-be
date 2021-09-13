package cost.management.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipologia_contratto database table.
 * 
 */
@Entity
@Table(name="tipologia_contratto")
@NamedQuery(name="TipologiaContratto.findAll", query="SELECT t FROM TipologiaContratto t")
public class TipologiaContratto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String tipologia;


	//bi-directional many-to-one association to Contratto
	@OneToMany(mappedBy="tipologiaContrattoBean")
	private List<Contratto> contrattos;

	public TipologiaContratto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public List<Contratto> getContrattos() {
		return this.contrattos;
	}

	public void setContrattos(List<Contratto> contrattos) {
		this.contrattos = contrattos;
	}

	public Contratto addContratto(Contratto contratto) {
		getContrattos().add(contratto);
		contratto.setTipologiaContrattoBean(this);

		return contratto;
	}

	public Contratto removeContratto(Contratto contratto) {
		getContrattos().remove(contratto);
		contratto.setTipologiaContrattoBean(null);

		return contratto;
	}

}