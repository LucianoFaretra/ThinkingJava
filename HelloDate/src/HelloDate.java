//: object/HelloDate.java

import java.util.Date;

/**
 * Il primo programma d'esempio di Thinking in Java.
 * Visualizza una stringa e la data odierna.
 *
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

public class HelloDate {
    /**
     * Punto d'ingresso per la classe e l'applicazione.
     *
     * @param args array di argomenti stringa
     * @throws exceptions Nessuna eccezzione sollevata
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's:");
        System.out.println(new Date());
    }
}
