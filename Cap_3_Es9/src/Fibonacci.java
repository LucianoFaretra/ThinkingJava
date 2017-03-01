/**
 * Programma che calcola il numero della stringa di fibonacci per la posizione inserita, overflow non gestito!!
 * @author Luciano Faretra
 * @version 0.1
 *
 */
public class Fibonacci {
    /**
     * Posizione di fibonacci da cercare
     */
    private int posizioneFibonacci;
    /**
     * numero parziale/finale di fibonacci calcolato
     */
    private long numeroFibonacci;
    /**
     * precedente numero calcolato della stringa di fibonacci
     */
    public long precedente1 = 1;
    /**
     * precendente del precedente numero della stringa di fibonacci calcolata
     */
    public long precedente2 = 1;

    /**
     * La funzione calcola il numero di fibonacci che salva in numeroFibonacci in base al valore posizioneFIbonacci
     * contenuta nell'oggetto
     */
    void getFibonacci() {
        for(int i = 1; i <= this.posizioneFibonacci; i++)
            if (i == 1) {
                System.out.println(i + " ");
            } else {
                this.numeroFibonacci = this.precedente1 + this.precedente2;
                System.out.println(this.numeroFibonacci + " ");
                this.precedente1 = this.precedente2;
                this.precedente2 = this.numeroFibonacci;
            }
    }

    /**
     * Punto d'inizio del programma
     * @param args Stringa contenente le informazioni passate da riga di comando al programma
     */
    public static void main(String[] args) {
        /**
         * Creazione di un oggetto di tipo Fibonacci
         */
        Fibonacci numeretto = new Fibonacci();

        numeretto.posizioneFibonacci = 10; //Scegli quale posizione della stringa di fibonacci calcolare
        numeretto.getFibonacci();//Calcola la posizione di fibonacci
    }
}