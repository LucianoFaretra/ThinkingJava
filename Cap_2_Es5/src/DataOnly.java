/** Programma con Classe di testa Data only e stampa
 * @author Luciano Faretra
 * @version 0.1
 */

public class DataOnly {
    /** Classe DataOnly
     * @param i Intero i
     * @param d cifra decimale
     * @param b booleano
     * @param args Stringa argomenti che riceve la funzione
     * @throw exceptions Nessuna eccezzione sollevata
     */
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        System.out.println("Valori di default delle variabili:");
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
        System.out.println();

        data.i = 3;
        data.b = true;
        data.d = 3.5960;

        System.out.println("Valori modificati delle variabili:");
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);

    }
}
