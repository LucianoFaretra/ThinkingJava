/**
 * Il programma crea una classe di enum che rappresentano sei tagli di banconote e stampa a video il loro valore e
 * ordinal
 * @author Luciano Daretra
 * @version 0.1
 */

/**
 * Dichiarazione dell'enumeratore MoneyValie avente 5 valori monetari
 */
enum MoneyValue{
    ONE_CENT, TWO_CENT, FIVE_CENT, FIFTY_CENT, ONE_EURO
}
public class EnumTest {
    /**
     * Punto d'ingresso del programma
     * @param args Stringa passata come input al programma, non utilizzato
     */
    public static void main(String[] args){
        /**
         * Il ciclo stampa tutti i valori enum che compongono MoneyValie e relativo ordinal
         */
        for(MoneyValue i : MoneyValue.values()){
            System.out.println(i + " ha ordinal pari a " + i.ordinal());
        }
    }
}
