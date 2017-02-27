/** Il programma implementa il metodo storage spiegato nel capitolo 2
 * @author Luciano Faretra
 * @version 0.1
 */
public class storage {
    /** Classe storage composta dalla stringa testString
     * @param testString Stringa utilizzata per i test
     */
    private String testString = "Test";

    /** Punto d'ingresso per la classe e l'applicazione.
     * @param args array di argomenti stringa
     * @param s oggetto di tipo storage
     * @throws exceptions Nessuna eccezione sollevata
     */
    public static void main(String[] args) {
        storage s = new storage();
        System.out.print("La lunghezza della stringa s è: ");
        System.out.println(s.testString.length());

        System.out.print("Il doppio della lunghezza della stringa s è: ");
        System.out.println(storage(s.testString));
    }

    /** Metodo storage che restituisce un valore intero pari al doppio del numero delle lettere
     * che compongono la stringa data in input
     * @param s stringa da analizzare
     * @return valore intero restituito dal metodo pari al doppio del numero di caratteri presenti in s
     */
    static int storage(String s){
        return s.length() * 2;
    }

}