package misiontic.edu.grupo32.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import misiontic.edu.grupo32.modelo.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long>{
	
	@Query("select count(*) from Usuario as p where p.nombreUsuario=:nombreUsuario and p.password=:password")
	Integer findByNombreUsuarioAndPassword(@Param("nombreUsuario") String nombreUsuario, @Param("password") String password);
	
	@Query("select p from Usuario as p where p.nombreUsuario=:nombreUsuario and p.password=:password")
	Usuario findByNameAndPassword(@Param("nombreUsuario") String nombreUsuario, @Param("password") String password);

}
