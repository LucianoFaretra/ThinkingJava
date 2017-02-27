/**Questo programma modifica la Hue di una rappresentazione
 * @author Luciano Faretra
 * @version 0.1
 */

/**Classe AllTheColorsOfTheRainbow
 *  @param anIntegerRepresentingColors intero contenente il valore del gradiente del colore
 */
public class AllTheColorsOfTheRainbow {
    private int anIntegerRepresentingColors;

    /**Funzione che permette l'assegnazione di un nuovo valore di gradiente
     * @param newHue nuovo valore
     */
    void changeTheHueOfTheColor(int newHue) {
        this.anIntegerRepresentingColors = newHue;
    }

    /**Punto d'ingresso del programma
     * @param args stringa contente i parametri passati al programma da terminale
     * @param titleBar oggetto di tipo AllTheColorsOfTheRainbow
     */
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow titleBar = new AllTheColorsOfTheRainbow();

        System.out.print("The actuale Hue of titleBar is >: ");
        System.out.println(titleBar.anIntegerRepresentingColors);
        System.out.println();

        titleBar.anIntegerRepresentingColors = 60;
        System.out.print("The new Hue is >: ");
        System.out.println(titleBar.anIntegerRepresentingColors);
    }
}
