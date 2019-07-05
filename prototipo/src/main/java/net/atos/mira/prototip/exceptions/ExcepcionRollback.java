package net.atos.mira.prototip.exceptions;

/**
 * Excepción personalizada.
 *
 * @author ATOS
 *
 */
public class ExcepcionRollback extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Excepción general.
     *
     * @param exception Excepción
     */
    public ExcepcionRollback(final Exception exception) {
        super(exception);
    }
    
    /**
     * Excepción general sin parámetros.
     */
    
    public ExcepcionRollback() {
        super();
    }
    
    /**
     * Excepción con mensaje.
     *
     * @param mensaje Mensaje que se mostrará al lanzar la excepción.
     */
    public ExcepcionRollback(final String mensaje) {
        super(mensaje);
    }
    
}
