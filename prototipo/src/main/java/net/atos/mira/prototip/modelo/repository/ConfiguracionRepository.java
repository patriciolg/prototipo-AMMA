package net.atos.mira.prototip.modelo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.atos.mira.prototip.modelo.entities.Configuracion;


/**
 * Repositorio de operaciones con base de datos para la entidad Configuración.
 *
 * @author ATOS
 *
 */
public interface ConfiguracionRepository extends CrudRepository<Configuracion, String> {

	/**
	 * Busca parámetros por la sección al que pertenecen.
	 * @param seccion de los parámetros
	 * @return lista de parámetos
	 */
	List<Configuracion> findByIdSeccion(String seccion);

}
