package net.atos.mira.prototip.modelo.auditor;


import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import net.atos.mira.prototip.modelo.entities.User;



/**
 * Implementación de la interfaz AuditorAware de Spring para poder realizar la auditoria de login.
 * 
 * @author ATOS
 *
 */
public class UsernameSecurityAuditorAwareImpl implements AuditorAware<Long> {

	/**
	 * Devuelve el nombre del usuario que ha iniciado sesión con éxito.
	 * 
	 * @return Long
	 * @see org.springframework.data.auditing.AuditingHandler.touchAuditor(AuditableBeanWrapper, boolean)
	 */
	@Override
	public Optional<Long> getCurrentAuditor() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User usuario = null;
		if (authentication != null && authentication.isAuthenticated()) {
			usuario = (User) authentication.getPrincipal();
		}
		return Optional.of(usuario.getId());
	}
}
