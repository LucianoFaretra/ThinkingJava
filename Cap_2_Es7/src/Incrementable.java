import java.util.ArrayList;

/** Implementazione del codice Incrementabile presente sul libro di testo
 * @author Luciano Faretra
 * @version 0.1
 */

class Incrementable {
    static void increment() {StaticTest.i++;}


    public  static void main(String[] args) {
        Incrementable st1 = new Incrementable();

        System.out.println("Stampa i valori di default di StaticTest");
        System.out.println(StaticTest.i);

        System.out.println("Stampa i valori incrementati di uno di StaticTest");
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}


class StaticTest {
    static int i = 47;
}