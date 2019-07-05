package net.atos.mira.prototip.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity creada para almacenar los parámetros de la aplicación.
 *
 * @author ATOS
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "CONFIGURACION")
public class Configuracion implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8731068972619191622L;

	/**
	 * Id de la tabla parámetros.
	 */
	@EmbeddedId
	private ConfiguracionId id;

	/**
	 * Valor del parámetro.
	 */
	@Column(name = "VALOR", length = 255, nullable = false)
	private String valor;
}
