package misiontic.edu.grupo32.servicio;

import org.springframework.http.ResponseEntity;

import misiontic.edu.grupo32.modelo.LoginDto;

public interface IUsuarioService {
	
	int login(LoginDto usuarioDto);
	ResponseEntity<?>ingresar(LoginDto usuarioDto);

}
