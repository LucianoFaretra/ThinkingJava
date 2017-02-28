import java.util.Random;

/**
 * Questo programma simula il lancio di una moneta
 *
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe moneta composta da una stringa che rappresenta la facccia della moneta
 */
public class lancioMoneta {
    /**
     * Stringa che rappresenta la faccia della moneta uscita
     */
    private String facciaMoneta = "NotDrop";

    /**
     * Punto d'ingresso del programma
     *
     * @param args Stringa contenente le istruzioni passate da terminale al momento del lancio del programma
     */
    public static void main(String[] args) {
        /**
         * Instanza dell'oggetto monetina
         */
        lancioMoneta monetina = new lancioMoneta();

        monetina.dropCoin();
        System.out.print("Il lancio della monetina ha dato come risultato >: " + monetina.facciaMoneta);
    }

    /**
     * Funzione che simula il lancio della moneta  e aggiornalo lo stato della stessa
     */
    private void dropCoin() {
        Random rand = new Random();
        this.facciaMoneta = "Croce";
        if (rand.nextBoolean())
            this.facciaMoneta = "Testa";
    }
}
