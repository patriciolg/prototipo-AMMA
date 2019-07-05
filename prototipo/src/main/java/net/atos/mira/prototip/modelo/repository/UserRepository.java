package net.atos.mira.prototip.modelo.repository;

import org.springframework.data.repository.CrudRepository;

import net.atos.mira.prototip.modelo.entities.User;


/**
 * Repositorio de operaciones con base de datos para la entidad Usuario.
 * @author ATOS
 */
public interface UserRepository extends CrudRepository<User, Long> {

	
	/**
	 * Recupera un usuario a partir del id recibido como parametro ignorando mayusculas y que está de alta.
	 * 
	 * @param String username del usuario a localizar
	 * @return Usuario resultado de la búsqueda
	 */
	User findByUsernameIgnoreCase(String username);


}
