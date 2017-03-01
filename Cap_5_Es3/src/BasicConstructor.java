/**
 * Classe per il test dei costruttorei standard di default
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe Airplane, il costruttore di default stampa un messaggio a video
 */
class Airplane {
    Airplane() {
        System.out.println("Costruttore di default chiamato!");
    }
}

public class BasicConstructor {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa ricevuta in input dal terminale per avviare il programma, non utilizzata
     */
    public static void main(String[] args) {
        /**
         * Crea un oggetto di tipo airplane e lo inizializza con il costruttore di default
         */
        new Airplane();
    }
}
