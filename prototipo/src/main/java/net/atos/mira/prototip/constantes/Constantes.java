package net.atos.mira.prototip.constantes;

/**
 * Clase para definir las constantes que se usan en la aplicación.
 *
 * @author ATOS
 *
 */
public class Constantes {

    /**
     * Palabra "login" para no repetirla n veces dentro de una clase.
     */
    public static final String LOGIN = "login";

    /**
     * Ruta "/login" para no repetirla n veces dentro de una clase.
     */
    public static final String RUTALOGIN = "/login";

    /**
     * Ruta "/logout" para no repetirla n veces dentro de una clase.
     */
    public static final String RUTALOGOUT = "/logout";

    /**
     * Palabra "Error" para no repetirla n veces dentro de una clase.
     */
    public static final String ERRORMENSAJE = "Error";

    /**
     * Identificador del mensaje global que se muestra en la aplicación.
     */
    public static final String IDMENSAJEGLOBAL = "messages";


    /**
     * Constructor privado.
     */
    private Constantes() {
        throw new IllegalAccessError("Constantes class");
    }
}
