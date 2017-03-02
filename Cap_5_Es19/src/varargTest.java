/**
 * Programma di tes sui cararg passati come parametri
 *
 * @author Luciano Faretra
 * @version 0.1
 */


public class varargTest {
    /**
     * Creazione metodo che accetta un array di stringhe varargTest
     *
     * @param args Stringhe passate al metodo
     */
    public static void stringAccept(String... args) {
        for (String i : args) {
            System.out.println(i);
        }
    }

    /**
     * Punto d'ingresso del programma
     *
     * @param args array di caratteri ricevuti al momento dell'esecuzione, non utilizzati dal programme
     */
    public static void main(String[] args) {
        /**
         * Crea un'array di stringhe e lo passa al metodo stringAccept
         */
        String[] stringArray = {"Ciao",};
        stringAccept(stringArray);

        /**
         * Passa direttamente al metodo delle stringhe create al volo
         */
        stringAccept("Ciao", "Amico");
    }
}
