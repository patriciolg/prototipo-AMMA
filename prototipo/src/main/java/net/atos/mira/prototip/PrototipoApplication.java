package net.atos.mira.prototip;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Clase de arranque y configuración de Spring Boot.
 * @author ATOS
 */
@SpringBootApplication
@EnableScheduling
public class PrototipoApplication {

	/**
	 * Punto de entrada de la aplicación para Spring Boot.
	 * @param args parámetros de entrada del método main
	 */
	public static void main(final String[] args) {
		SpringApplication.run(PrototipoApplication.class, args);
	}

	/**
	 * Metodo de configuración para el modo developer.
	 */
	@Configuration
	@Profile("dev")
	static class ConfigureJSFContextParameters implements ServletContextInitializer {
		/**
		 * Metodo de aranque.
		 * @param servletContext contexto de servlet
		 */
		@Override
		public void onStartup(final ServletContext servletContext) {
			servletContext.setInitParameter("encoding", "UTF8");

		}
	}

	/**
	 * Metodo de configuración para el modo produccion.
	 */
	@Configuration
	@Profile("prod")
	static class ConfigureJSFContextParametersProd implements ServletContextInitializer {
		/**
		 * Metodo de aranque.
		 * @param servletContext contexto de servlet
		 */
		@Override
		public void onStartup(final ServletContext servletContext) {
			servletContext.setInitParameter("encoding", "UTF8");
		}
	}
}
