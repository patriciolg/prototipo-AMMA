package net.atos.mira.prototip.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase ID para la tabla parámetros.
 *
 * @author ATOS
 *
 */
@EqualsAndHashCode(of = { "seccion", "clave" })
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Embeddable
public class ConfiguracionId implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8731068972619191622L;

	/**
	 * Sección del parámetro.
	 */
	@Column(name = "seccion", length = 255, nullable = false)
	private String seccion;

	/**
	 * Código con el apartado al que pertenece el parámetro.
	 */
	@Column(name = "clave", length = 100, nullable = false)
	private String clave;
}
