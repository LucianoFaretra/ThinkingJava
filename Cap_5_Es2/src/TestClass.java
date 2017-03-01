/**
 * Test stringa non inizializzata
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Costruttore dell'oggetto Frase contentente una stringa e inizializzata alla creazione
 */
class Frase {
    /**
     * Variabile parola di tipo stringa contenente la frase inizializzata
     */
    String parola;
    Frase() {
        this.parola = "Stringa inizializzata dal costruttore";
    }
}

public class TestClass {
    /**
     * Punto d'inizio del programma
     * @param args Stringa passata al programma da terminale in input
     */
    public static void main(String[] args) {
        /**
         * Variabile frase di tipo stringa non inizializzata
         */
        String frase = "Stringa inizializzata alla dichiarazione";
        System.out.println(frase);

        /**
         * Creazione di un'oggetto Frase contenente la parola inizializzata dal costruttore
         */
        Frase parola = new Frase();
        System.out.println(parola.parola);
    }
}

