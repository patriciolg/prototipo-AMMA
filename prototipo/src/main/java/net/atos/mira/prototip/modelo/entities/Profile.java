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
 * Entity para un profile.
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
@Table(name = "A_PERFILES")
public class Profile extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * profile.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROFILE")
	@SequenceGenerator(name = "SEQ_PROFILE", sequenceName = "SEQ_PROFILE", allocationSize = 1)
	@Column(name = "id", length = 5)
	private Long id;


	/**
	 * Nombre del perfil.
	 */
	@Column(name = "NAME", length = 200)
	private String nombre;

	

	/**
	 * Sobreescritura del método toString para por usar el SelectItemsConverter de manera genérica, devolviendo siempre
	 * la clave primaria.
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return id.toString();
	}

}
