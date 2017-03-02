/**
 * Programma per il test dell'inizializzatore di stringhe
 *
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * La classe forma un oggetto contenente una stringa che viene inizializzata mediante l'inizializzazione di istanza
 */
class StringInitializer {
    String stringa;

    {
        stringa = "Stringa inizializzata mediante inizializzatore d'istanza";
    }
}

public class InizializzatoreIstanza {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa di caratteri passati al programma da terminale al momento dell'avvio
     */
    public static void main(String[] args) {
        /**
         * Creazione di un nuovo oggetto
         */
        StringInitializer stringObj = new StringInitializer();
        System.out.println(stringObj.stringa);
    }
}
