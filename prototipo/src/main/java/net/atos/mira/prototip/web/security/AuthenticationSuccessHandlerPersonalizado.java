package net.atos.mira.prototip.web.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * Clase que gestiona los accesos exitosos a la aplicación. Registra en acceso para auditoría y redirige a la vista
 * Index.
 * @author ATOS
 */
@Component
public class AuthenticationSuccessHandlerPersonalizado implements AuthenticationSuccessHandler {

	/**
	 * Auditoría de inicios de sesión satisfactorios.
	 * @param request petición
	 * @param response respuesta
	 * @param autentication autenticación
	 * @throws IOException excepción de entrada o salida de datos
	 */
	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request, final HttpServletResponse response,
			final Authentication autentication) throws IOException {
		response.setStatus(HttpServletResponse.SC_OK);
		response.sendRedirect("index");
	}

}
