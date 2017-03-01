/**
 * Test di overload degli inizializzaztori
 *
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe Bark con dicersi inizializzatori in base alla primitiva passata come parametro
 */
class Bark {
    Bark(int i) {
        System.out.println("Il cane abbaia");
    }

    Bark(double i) {
        System.out.println("Il cane mugola");
    }

    Bark(float i) {
        System.out.println("Il cane guaisce");
    }

    Bark(char i) {
        System.out.println("Il cane si fa i cazzi sua");
    }
}

public class Dog {
    /**
     * Punto d'ingresso del programma
     *
     * @param args Stringa passata in input al programma da terminale
     */
    public static void main(String[] args) {
        int i = 0;
        double j = 0.0d;
        float k = 0.0f;
        char y = ' ';
        Bark caneCasa = new Bark(i);
        Bark caneCampagna = new Bark(j);
        Bark caneVicino = new Bark(k);
        Bark caneRandagio = new Bark(y);

    }
}
