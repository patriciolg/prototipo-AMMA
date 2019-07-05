package net.atos.mira.prototip.modelo.search;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.atos.mira.prototip.modelo.entities.Profile;
import net.atos.mira.prototip.modelo.entities.Role;

/**
 * Controlador de las operaciones relacionadas con la búsqueda de usuarios. Reseteo de valores de búsqueda.
 * 
 * @author ATOS
 */

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSearch implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Fecha alta de usuarios desde la que busca.
	 */
	private Date fechaDesde;

	/**
	 * Fecha alta de usuarios hasta la que busca.
	 */
	private Date fechaHasta;

	/**
	 * Filtro username.
	 */
	private String username;

	/**
	 * Filtro primer apellido user.
	 */
	private String apellido;

	/**
	 * Filtro nombre user.
	 */
	private String nombre;

	/**
	 * Filtro rol user.
	 */
	private Role role;

	/**
	 * Filtro profile al que pertenece el user.
	 */
	private Profile profile;

}
