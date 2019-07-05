package net.atos.mira.prototip.modelo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;


/**
 * Clase abstracta para evitar la duplicidad de código en el resto de las entities.
 *
 * @author ATOS
 *
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5041785485043966367L;

	/**
	 * Id del usuario de creación.
	 */
	@CreatedBy
	@Column(name = "USER_CREATION", nullable = false)
	protected Long idUserAlta;

	/**
	 * Fecha de creación.
	 */
	@CreatedDate
	@Column(name = "CREATION_DATE", nullable = false)
	protected Date fechaAlta;

	/**
	 * Id del Usuario de baja.
	 */
	@Column(name = "USER_DELETED")
	protected Long idUserBaja;

	/**
	 * Fecha de baja.
	 */
	@Column(name = "DELETED_DATE")
	protected Date fechaBaja;

	/**
	 * Id del Usuario que realiza la última modificación.
	 */
	@LastModifiedBy
	@Column(name = "USER_MODIFICATION")
	protected Long idUserModif;

	/**
	 * Fecha de última modificación.
	 */
	@LastModifiedDate
	@Column(name = "MODIFICATION_DATE")
	protected Date fechaModificacion;

}
