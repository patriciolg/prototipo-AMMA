package net.atos.mira.prototip.modelo.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * Entidad para el almacenamiento de un Usuario.
 *
 * @author ATOS
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "username")
@Builder
@ToString
@Getter
@Setter
@Entity
@Table(name = "A_USERS")
public class User extends AbstractEntity implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -7888266252869220306L;
	/**
	 * Identificador del usuario. Generada por secuencia.
	 */
	@Id
	@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")
	@Column(name = "id", nullable = false)
	private Long id;
	/**
	 * Username.
	 */

	@Column(name = "LOGIN", nullable = false)
	private String username;

	/**
	 * password.
	 */
	@Column(name = "PASSWORD")
	private String password;

	/**
	 * Identificador unico del Rol del usuario..
	 */
	@ManyToOne
	@JoinColumn(name = "ROLE_ID", foreignKey = @ForeignKey(name = "FK_USER_ROL"))
	private Role role;

	/**
	 * Profile que tiene el usuario.Unidireccional.
	 */
	@ManyToOne
	@JoinColumn(name = "PERFIL_ID", foreignKey = @ForeignKey(name = "FK_U_PROFILE"))
	private Profile profile;

	/**
	 * Apellido usuario.
	 */
	@Column(name = "LASTNAME")
	private String apellido;

	/**
	 * Nombre completo usuario.
	 */
	@Column(name = "FIRSTNAME")
	private String nombre;



}
