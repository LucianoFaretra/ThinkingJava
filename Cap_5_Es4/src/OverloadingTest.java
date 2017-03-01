/**
 * Classe per il test dei costruttori sovraccaricati
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe Airplane, il costruttore di default stampa un messaggio a video, quello sovraccaricato accoda la stringa
 * inserita alla frase di default
 */
class Airplane {
    Airplane()             { System.out.println("Costruttore di default chiamato!"); }
    Airplane(String frase) { System.out.println("Costruttore di default chiamato!" + frase); }
}

public class OverloadingTest {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa ricevuta in input dal terminale per avviare il programma, non utilizzata
     */
    public static void main(String[] args) {
        /**
         * Crea un oggetto di tipo airplane e lo inizializza con una stringa
         */
        new Airplane(" Yes, questa volta è sovraccaricato!");
    }
}
