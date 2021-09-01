package cost.management.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
<<<<<<< HEAD
@Table(name="utente")
=======
>>>>>>> e320b1b8ce9f8c5b80cb3e20b22daed2105f55cd
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	private String password;

	public Utente() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
	public String getPassword() {
		return this.password;
	}

=======
>>>>>>> e320b1b8ce9f8c5b80cb3e20b22daed2105f55cd
	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD
=======
	public String getPassword() {
		return this.password;
	}

>>>>>>> e320b1b8ce9f8c5b80cb3e20b22daed2105f55cd
}