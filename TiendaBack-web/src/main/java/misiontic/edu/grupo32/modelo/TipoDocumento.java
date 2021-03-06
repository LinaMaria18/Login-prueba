package misiontic.edu.grupo32.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = TipoDocumento.TABLE_NAME)
public class TipoDocumento {
	public static final String TABLE_NAME ="tipodocumento";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo")
	private String tipo;
	
	//Constructores
	public TipoDocumento() {
	}

	public TipoDocumento(Long id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	//Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
