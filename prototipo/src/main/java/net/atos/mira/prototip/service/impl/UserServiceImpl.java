package net.atos.mira.prototip.service.impl;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.atos.mira.prototip.modelo.entities.User;
import net.atos.mira.prototip.modelo.repository.UserRepository;
import net.atos.mira.prototip.modelo.search.UserSearch;
import net.atos.mira.prototip.service.UserService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
/**
 * Implementación de la interfaz donde se define la lógica de negocio para los usuarios.
 * @author ATOS
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * Factoría de sesiones.
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * Repositorio de usuarios.
	 */
	@Autowired
	private UserRepository userRepository;

	/**
	 * Recupera un usuario a partir del username recibido como parámetro ignorando mayúsculas.
	 * @param username del usuario a localizar
	 * @return usuario
	 */
	@Override
	public User findByUsername(final String username) {
		return this.userRepository.findByUsernameIgnoreCase(username);
	}

	@Override
	/**
	 * Devuelve el número total de registros resultado de la búsqueda.
	 * 
	 * @param userSearch Objeto que contiene los parámetros de búsqueda
	 * @return número de registros resultantes de la búsqueda
	 */
	public int contarRegistros(final UserSearch userSearch) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			// Para implementar con Hibernate 5.2
			// CriteriaBuilder builder = session.getCriteriaBuilder();
			// CriteriaQuery<User> criteria = builder.createQuery(User.class);
			// Root<User> root = criteria.from(User.class);
			// criteria.select(root);

			@SuppressWarnings("deprecation")
			final Criteria criteria = session.createCriteria(User.class, "user");
			this.creaCriteria(userSearch, criteria);
			criteria.setProjection(Projections.rowCount());
			final Long cnt = (Long) criteria.uniqueResult();

			return Math.toIntExact(cnt);
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}

	/**
	 * Introduce parámetros de búsqueda dentro del criteria.
	 * 
	 * @param userSearch Objeto que contiene los parámetros a introducir
	 * @param criteria Criteria que se desea modificar.
	 */
	private void creaCriteria(final UserSearch userSearch, final Criteria criteria) {

		if (userSearch.getUsername() != null) {
			criteria.add(Restrictions.ilike("username", userSearch.getUsername(), MatchMode.ANYWHERE));
		}

		if (userSearch.getFechaDesde() != null) {
			criteria.add(Restrictions.ge("fechaAlta", userSearch.getFechaDesde()));
		}

		if (userSearch.getFechaHasta() != null) {
			final Date fechaHasta = new Date(userSearch.getFechaHasta().getTime() + TimeUnit.DAYS.toMillis(1));
			criteria.add(Restrictions.le("fechaAlta", fechaHasta));
		}
		if (userSearch.getApellido() != null) {
			criteria.add(Restrictions.ilike("apellido", userSearch.getApellido(), MatchMode.ANYWHERE));
		}

		if (userSearch.getRole() != null) {
			criteria.add(Restrictions.eq("role", userSearch.getRole()));
		}

		criteria.add(Restrictions.isNull("fechaBaja"));

	}

}
