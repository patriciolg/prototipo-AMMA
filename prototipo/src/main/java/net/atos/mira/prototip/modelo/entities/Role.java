package net.atos.mira.prototip.modelo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * 
 * Entity para los roles de los usarios
 * 
 * @author ATOS
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "id")
@Builder
@Getter
@Setter
@Entity
@Table(name = "A_ROLES")
public class Role extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID ROLE.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ROLE")
	@SequenceGenerator(name = "SEQ_ROLE", sequenceName = "SEQ_ROLE", allocationSize = 1)
	@Column(name = "id", length = 5)
	private Long id;

	/**
	 * Nombre del perfil configurado para Spring Security 4. Debe comenzar por ROLE_.
	 */
	@Column(name = "NAME")
	private String name;

	/**
	 * Nombre del perfil.
	 */
	@Column(name = "DESCRIPTION")
	private String descripcion;


	/**
	 * Sobreescritura del método toString para por usar el SelectItemsConverter de manera genérica, devolviendo siempre
	 * la clave primaria.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return this.id.toString();
	}
}
