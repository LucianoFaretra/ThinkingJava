/**
 * Il programma testa l'utilizzo di una definizione statica per una stringa
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Dichiarazione classe static string formata da due stringhe statiche
 */
class StaticString{
    /**
     * Inizializzazione della stringa statica al momento della definizione
     */
    static String word = "Stringa static";
    /**
     * Inizializzazione della stringa statica in un ciclo statico
     */
    static String word2;
    static {
        word2 = "Stringa static inizializzata in un blocco static";
    }

    /**
     * Il metodo mostra a video il contenudo delle due stringhe statiche
     */
    void staticStringViewer() {
        System.out.println(word);
        System.out.println(word2);

    }
}

public class StaticTest {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa passata al programma al momento dell'avvio, inutilizzata in questo momento
     */
    public static void main(String[] args){
        StaticString stringObj = new StaticString();
        stringObj.staticStringViewer();
    }
}

