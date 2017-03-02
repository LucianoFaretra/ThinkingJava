/**
 * Il programma crea una classe di enum che rappresentano sei tagli di banconote e stampa la descrizione di ogni valuta
 *
 * @author Luciano Daretra
 * @version 0.1
 */

/**
 * Dichiarazione dell'enumeratore MoneyValie avente 5 valori monetari
 */
enum MoneyValue {
    ONE_CENT, TWO_CENT, FIVE_CENT, FIFTY_CENT, ONE_EURO
}

public class MoneyValueSwitch {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa passata come input al programma, non utilizzato
     */
    public static void main(String[] args) {
        /**
         * Il ciclo stampa tutti i valori enum che compongono MoneyValie e relativa descrizione
         */
        for (MoneyValue i : MoneyValue.values()) {
            switch (i) {
                case ONE_CENT:
                    System.out.println("Moneta da un centesimo di rame");
                    break;
                case TWO_CENT:
                    System.out.println("Moneta da due centesimi di rame");
                    break;
                case FIVE_CENT:
                    System.out.println("Moneta da cinque centesimi di rame");
                    break;
                case FIFTY_CENT:
                    System.out.println("Moneta da cinquanta centesimi bronzea");
                    break;
                case ONE_EURO:
                    System.out.println("Moneta da un euro di metallo composito");
            }
        }
    }
}