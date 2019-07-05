package net.atos.mira.prototip.exceptions;

/**
 * Excepción personalizada.
 *
 * @author ATOS
 *
 */
public class PrototipoException extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = -4393210445151107288L;
    
    /**
     * Excepción general.
     *
     * @param exception Excepción
     */
    public PrototipoException(final Exception exception) {
        super(exception);
    }
    
    /**
     * Excepción general sin parámetros.
     */
    
    public PrototipoException() {
        super();
    }
    
    /**
     * Excepción con mensaje.
     *
     * @param mensaje Mensaje que se mostrará al lanzar la excepción.
     */
    public PrototipoException(final String mensaje) {
        super(mensaje);
    }
    
}
