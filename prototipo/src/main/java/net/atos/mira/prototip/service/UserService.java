package net.atos.mira.prototip.service;

import net.atos.mira.prototip.modelo.entities.User;
import net.atos.mira.prototip.modelo.search.UserSearch;

/**
 * Implementación del servicio de usuarios.
 *
 * @author ATOS
 *
 */
public interface UserService {

	/**
	 * Recupera un usuario a partir del id recibido como parámetro ignorando mayúsculas.
	 * @param username del usuario a localizar
	 * @return resultado de la búsqueda
	 */
	User findByUsername(String username);

	/**
	 * Devuelve el número total de registros resultado de la búsqueda.
	 * @param userSearch Objeto que contiene los parámetros de búsqueda
	 * @return número de registros resultantes de la búsqueda
	 */
	int contarRegistros(UserSearch userSearch);

}