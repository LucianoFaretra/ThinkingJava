import java.util.Random;

/**Il programma genera 25 interi random e per ognuno di essi genera un'altro e lo confronta con quello generato
 * precedentemente. stampa in output i risultati dell'elaborazione.
 * @author Luciano Faretra
 * @version 0.1
 */
public class evalRandom {
    /**
     * randomNumber contiene il numero random dell'oggetto
     */
    private int randomNumber;

    /**
     * La funzione create RandInt genera un numero random nel range da 0 a 100 e lo salva in randomNumber.
     */
    void createRandInt() {
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
    }

    /**
     * Punto d'ingresso del programma
     * @param args Stringa di caratteri che passa il terminale come parametri d'avvio
     */
    public static void main(String[] args) {
        /**
         * toEvalue numero da valutare generato in modo casuale
         */
        evalRandom toEvalue = new evalRandom();
        /**
         * newRand numero random successivo da confrontare con toEvaluate
         */
        evalRandom newRand = new evalRandom();

        for (int i = 0; i <= 25; ++i) {
            toEvalue.createRandInt();
            newRand.createRandInt();

            System.out.print("Il numero casuale " + toEvalue.randomNumber);

            if(toEvalue.randomNumber < newRand.randomNumber) {
                System.out.print(" e' più piccolo del successivo numero generato casualmente ");
            }
            else if(toEvalue == newRand){
                System.out.print(" e' uguale del successivo numero generato casualmente ");
            }
            else{
                System.out.print(" e' più grade del successivo numero generato casualmente ");
            }
            System.out.println("pari a " + newRand.randomNumber);
        }
    }

}
