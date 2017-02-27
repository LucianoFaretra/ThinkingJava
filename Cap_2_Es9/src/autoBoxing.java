/**Test funzionalità di autoboxing
 * @author Luciano Faretra
 * @version 1.0
 */
public class autoBoxing {
    /**Questa è la parte d'ingresso del programma
     * @param interoProvaAutoBoxing intero ti test con funzione autoboxing
     * @param interoProvaNoAutoBoxing intero ti test senza funzione autoboxing
     * @param args
     */
    public static void main(String[] args) {
        int interoProvaAutoBoxing = 8;
        Integer interoProvaNoAutoBoxing = new Integer(8);

        System.out.println(interoProvaAutoBoxing);
        System.out.println(interoProvaNoAutoBoxing);
    }
}
