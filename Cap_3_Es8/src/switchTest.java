/** Testu funzione switch
 * @author Luciano Faretra
 * @version 0.1
 */
public class switchTest {
    /**
     * Inizio esecuzione programma
     * @param args Stringa contenente i parametri passati all'avvio
     */
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            switch (i){
                case 1 : System.out.println("i è il numero " + i); break;
                case 2 : System.out.println("i è il numero " + i); break;
                case 3 : System.out.println("i è il numero " + i); break;
                case 4 : System.out.println("i è il numero " + i); break;
                case 5 : System.out.println("i è il numero " + i); break;
                default:
            }
        }
    }
}
