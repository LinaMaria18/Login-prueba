package misiontic.edu.grupo32.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import misiontic.edu.grupo32.modelo.LoginDto;
import misiontic.edu.grupo32.repositorio.ITipoDocumento;
import misiontic.edu.grupo32.servicio.IUsuarioService;

@RestController
public class AppControlador {

	@Autowired
	IUsuarioService iUsuario;
	
	@Autowired
	ITipoDocumento iTipoDocumento;
	
	@CrossOrigin(origins = {"http://localhost:8010"}) // recibe la solicitud del front
	@PostMapping("/logincliente")
	public int login(@RequestBody LoginDto usuario) {
		int responseLogin = iUsuario.login(usuario);
		return responseLogin;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginCliente(@RequestBody LoginDto usuario){
		return iUsuario.ingresar(usuario);
	}
}
