package misiontic.edu.grupo32.modelo;

public class LoginDto {
	private String nombreUsuario;
	private String password;
	
	
	// Constructors
	public LoginDto() {
	}
	
	public LoginDto(String nombreUsuario, String password) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	// Getters and setters
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
