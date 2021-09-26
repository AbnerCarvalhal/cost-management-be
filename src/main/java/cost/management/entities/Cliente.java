package cost.management.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="partita_iva")
	@NotBlank(message = "partita iva obbligatoria")
	@Pattern(regexp = "\\d{11}")
	private String partitaIva;

	@Column(name="codice_fiscale")
	@NotBlank(message = "codice fiscale obbligatorio")
	@Pattern(regexp = "\\d{11}")
	private String codiceFiscale;
	
	@Column(name="codice_interscambio")
	@Pattern(regexp = "\\S{7}")
	private String codiceInterscambio;
	
	@Email
	private String pec;

	@Column(name="ragione_sociale")
	@Size(min = 1,max = 30,message = "ragione sociale obbligatoria")
	private String ragioneSociale;

	@Column(name="sede_legale")
	@Size(min = 1,max = 30,message = "sede legale obbligatoria")
	private String sedeLegale;

	//bi-directional many-to-one association to Commessa
	@OneToMany(mappedBy="cliente")
	@JsonManagedReference(value="commesse-cliente")
	private List<Commessa> commesse;

	public Cliente() {
	}

	public String getPartitaIva() {
		return this.partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	

	public String getCodiceInterscambio() {
		return this.codiceInterscambio;
	}

	public void setCodiceInterscambio(String codiceInterscambio) {
		this.codiceInterscambio = codiceInterscambio;
	}

	public String getPec() {
		return this.pec;
	}

	public void setPec(String pec) {
		this.pec = pec;
	}

	public String getRagioneSociale() {
		return this.ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getSedeLegale() {
		return this.sedeLegale;
	}

	public void setSedeLegale(String sedeLegale) {
		this.sedeLegale = sedeLegale;
	}

	public List<Commessa> getCommesse() {
		return this.commesse;
	}

	public void setCommesse(List<Commessa> commesse) {
		this.commesse = commesse;
	}

	public Commessa addCommessa(Commessa commessa) {
		getCommesse().add(commessa);
		commessa.setCliente(this);

		return commessa;
	}

	public Commessa removeCommessa(Commessa commessa) {
		getCommesse().remove(commessa);
		commessa.setCliente(null);

		return commessa;
	}

}
