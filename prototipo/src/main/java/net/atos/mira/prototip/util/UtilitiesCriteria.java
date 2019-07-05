package net.atos.mira.prototip.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 * Clase de utilidades para establecer condiciones de criteria.
 * @author ATOS
 */
public final class UtilitiesCriteria {
	/**
	 * Método constructor.
	 */
	private UtilitiesCriteria() {
		throw new IllegalStateException("UtilitiesCriteria class");
	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el operador like.
	 * @param value Object
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionCriteriaCadenaLike(final String value, final Criteria criteria,
			final String nombreCampo) {
		if (value != null && !value.trim().isEmpty()) {
			criteria.add(Restrictions.ilike(nombreCampo, value.trim(), MatchMode.ANYWHERE));
		}
	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el operador mayor igual que.
	 * @param fechaDesde Date
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionCriteriaFechaMayor(final Date fechaDesde, final Criteria criteria,
			final String nombreCampo) {
		if (fechaDesde != null) {
			final Date fechaDesdeIgual = new Date(fechaDesde.getTime() + TimeUnit.DAYS.toMillis(1));
			criteria.add(Restrictions.ge(nombreCampo, fechaDesdeIgual));
		}

	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el operador menor igual que.
	 * @param fechaHasta Date
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionCriteriaFechaMenorIgual(final Date fechaHasta, final Criteria criteria,
			final String nombreCampo) {
		if (fechaHasta != null) {
			final Date fechaHastaIgual = new Date(fechaHasta.getTime() + TimeUnit.DAYS.toMillis(1));
			criteria.add(Restrictions.lt(nombreCampo, fechaHastaIgual));
		}

	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el operador igual.
	 * @param value Object
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionCriteriaIgualdad(final Object value, final Criteria criteria,
			final String nombreCampo) {
		if (value != null) {
			criteria.add(Restrictions.eq(nombreCampo, value));
		}
	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el valor null sobre un campo.
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionNull(final Criteria criteria, final String nombreCampo) {
		criteria.add(Restrictions.isNull(nombreCampo));
	}

	/**
	 * Método para establecer un criterio de búsqueda sobre un criteria con el valor no null sobre un campo.
	 * @param criteria Criteria
	 * @param nombreCampo String
	 */
	public static void setCondicionNotNull(final Criteria criteria, final String nombreCampo) {
		criteria.add(Restrictions.isNotNull(nombreCampo));
	}
}