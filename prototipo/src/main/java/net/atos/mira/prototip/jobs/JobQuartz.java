package net.atos.mira.prototip.jobs;

import org.springframework.stereotype.Component;

/**
 *
 * Tareas automaticas.
 *
 * @author ATOS
 *
 */
@Component
public class JobQuartz {
    
    // // Se ejecuta cada 30 segundos
    // @Scheduled(fixedRate = 30000)
    // public void tarea1() {
    // System.out.println("Tarea usando fixedRate cada 30 segundos - tarea1 .. ");
    // }
    //
    // // Se ejecuta cada 50 segundos, recuperando desde properties los valores
    // @Scheduled(fixedRateString = "${imprime.tarea}")
    // public void tarea2() {
    // System.out.println("Tarea usando fixedRateString cada 50 segundos - tarea2... ");
    // }
    //
    // // Tarea que se ejecuta con retraso inicial de 10 segundos
    // @Scheduled(fixedRate = 30000, initialDelay = 10000)
    // public void tarea3() {
    // System.out.println("Tarea con retraso inicial de 10 segundos -tarea3... ");
    // }
    //
    // // La expresión de Cron
    // // (segundo, minuto, hora, día del mes, mes, día (s) de la semana)
    // // (*) significa emparejar cualquier
    // // */X significa "cada X"
    // // (* * * * *) =cron se ejecutará cada minuto, todo el tiempo
    // // (0 * * * *) = cron se ejecutará en el minuto cero, cada hora (es decir, un trabajo cron por hora)
    // // (15 * * * *) =cron se ejecutará por hora, pero se ejecuta en el minuto 15 (es decir, 00:15, 01:15, 02:15,
    // etc.)
    // // (30 2 * * *) =cron se ejecutará una vez al día, a las 2:30 a.m
    // // (*/10 * * * * *) = cron se ejecutará cada diez segundos.
    // // (0 0 8-10 * * *) = cron se ejecutará a las 8, 9 y 10 en punto de cada día.
    // // (0 0 2 * *) =cron se ejecutará una vez al mes, en el segundo día del mes a la medianoche (es decir, el 2 de
    // enero
    // // a las 12:00 a.m., el 2 de febrero a las 12:00 a.m., etc.)
    // // (0 * * * 1) =cron se ejecutará los lunes, cada hora (es decir, 24 veces en un día, pero solo los lunes)
    // // (0,10,20 * * * *) =cron se ejecutará tres veces cada hora, en los minutos 0, 10 y 20
    // // (0 0/30 8-10 * * *) = 8:00, 8:30, 9:00, 9:30 y 10 en punto todos los días.
    // // (0 0 9-11 * * MON-FRI) = cron se ejecutará una vez cada hora entre las 9:00 am y 11:00 am cinco días de la
    // semana
    // // (@reboot) = ejecutar un trabajo cron cada vez que se reinicie el servidor
    // // (@yearly y @annually) =cron se ejecutará todos los años a las 12:00 am del 1 de enero (0 0 1 1 *)
    // // (@daily y @midnight) =cron se ejecutará todos los días a las 12:00 am (0 0 * * *)
    // // (@monthly) =cron se ejecutará una vez al mes , el primero, a las 12:00 am. (0 0 1 * *)
    // // (@weekly) =cron se ejecutará una vez a la semana a las 12:00 am del domingo (0 0 * * 0)
    // // (@hourly) =cron se ejecutará cada hora (0 * * * *)
    //
    // // Tarea que se ejecuta con marcaciones de crono cada 10 segundos
    // @Scheduled(cron = "*/10 * * * * *")
    // public void tarea4() {
    // System.out.println("Tarea usando expresiones cron - tarea4..." + new Date());
    // }
}
