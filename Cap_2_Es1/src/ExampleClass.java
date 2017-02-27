//: object/ExampleClass.java
import java.util.*;

/** Esercizio numero 1. Libro Thinking in Java 4° edizione volume 1, pagina 72.
 * Analisi del comportamento dell'interprete java alla presenza di valori non inizializzati
 * @author Luciano Faretra
 * @version 0.1
 */
public class ExampleClass {
    /** Punto d'ingresso per la classe e l'applicazione.
     * @param args array di argomeniti stringa
     * @param intTest Variabile intera di test
     * @param charTest Variabile char di test
     * @throws exceptions Nessuna eccezzione sollevata
     */

    public static void main(String[] args) {
        int intTest;
        char charTest;

        System.out.print("Stampa l'intero di test non inizializzato >: ");
        System.out.println(intTest);

        System.out.print("Stampa il carattere di test non inizializzato >:");
        System.out.println(charTest);
    }
}
