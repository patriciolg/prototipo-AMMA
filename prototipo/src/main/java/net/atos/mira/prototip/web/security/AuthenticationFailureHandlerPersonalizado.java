package net.atos.mira.prototip.web.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**
 * Manejador de errores de autenticación en el login.
 * @author ATOS
 */
@Component
public class AuthenticationFailureHandlerPersonalizado extends SimpleUrlAuthenticationFailureHandler {

	/**
	 * Controla el funcionamiento del sistema cuando se produce un error al hacer login.
	 * @param request petición
	 * @param response respuesta
	 * @param exception excepción de autenticación
	 * @throws IOException excepción de entrada o salida de datos
	 */
	@Override
	public void onAuthenticationFailure(final HttpServletRequest request, final HttpServletResponse response,
			final AuthenticationException exception) throws IOException {

		final String usuario = request.getParameter("username");
		final StringBuilder textoReg = new StringBuilder(200);
		textoReg.append("Se ha producido un intento de login fallido en el sistema\n\n  Usuario implicado: ")
				.append(usuario).append(" '\n'  Error detectado: ");
		if (exception.getMessage().contains("locked")) {
			textoReg.append("Cuenta bloqueada");
		}
		else if (exception.getMessage().contains("Bad credentials")) {
			textoReg.append("Usuario o contraseña incorrectos");
		}
		else if (exception.getMessage().contains("Maximum sessions")) {
			textoReg.append("Ya existe una sesión abierta para este usuario");
		}
		saveException(request, exception);

	}

}
