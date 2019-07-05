package net.atos.mira.prototip.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.atos.mira.prototip.modelo.entities.User;

/**
 * Servicio de login.
 * @author ATOS
 */
@Service
public class LoginService implements UserDetailsService {

	/**
	 * Servicio de usuarios.
	 */
	@Autowired
	private UserService userService;

	/**
	 * Devuelve los datos de un usuario cuyo username se ha recibido como parámetro.
	 * @param username Username del usuario a buscar.
	 * @return Detalles del usuario
	 */
	@Override
	public UserDetails loadUserByUsername(final String username) {
		final User user = userService.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("El usuario " + username + " no existe.");
		}
		return new UserRepositoryUserDetails(user);
	}

	/**
	 * Clase UserRepositoryUserDetails.
	 * @return user Usuario
	 */
	private static final class UserRepositoryUserDetails extends User implements UserDetails {

		/**
		 * Serial ID.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Constructor que recibe como parámetro un usuario.
		 * @param user Usuario del que se desean los detalles.
		 */
		public UserRepositoryUserDetails(final User user) {
			super();
			setUsername(user.getUsername());
			setPassword(user.getPassword());
			setNombre(user.getNombre());
			setApellido(user.getApellido());
			setFechaBaja(user.getFechaBaja());
		}

		/**
		 * getAuthorities.
		 * @return authorities.
		 */
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			final Set<GrantedAuthority> authorities = new HashSet<>();
			authorities.add(new SimpleGrantedAuthority(getRole().getName()));
			return authorities;
		}

		/**
		 * isAccountNonExpired.
		 * @return boolean.
		 */
		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		/**
		 * isAccountNonLocked.
		 * @return getFechaInactividad.
		 */
		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		/**
		 * isCredentialsNonExpired.
		 * @return boolean.
		 */
		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		/**
		 * isEnabled.
		 * @return boolean.
		 */
		@Override
		public boolean isEnabled() {
			return getFechaBaja() == null;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return null;
		}

	}

}
