/**
 * Genera un array di stringhe e lo mostra a video
 * @author Luciano Faretra
 * @version 0.1
 */


/**
 * Crea un oggetto StringObj formato da un'array di stringhe e le inizializza
 */
class StringObj{
    /**
     * Creazione array di stringhe e relativa inizializzazione
     */
    String[] array = new String[] {"Primo", "Secondo", "Terzo", "Quarto", "Quinto",};

    /**
     * Creazione metodo per mostrare a video le stringhe
     */
    void showStringObj(){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

public class StringArray {
    /**
     * Punto d'ingresso per il programma
     * @param args Stringa passata dal terminale come parametro del programma, attualmente non utilizzata
     */
    public static void main(String[] args){
        /**
         * Creazione dell'oggetto di tripo array stringhe
         */
        StringObj arrayTest = new StringObj();
        /**
         * invocazione del metodo per mostrare le stringhe a video
         */
        arrayTest.showStringObj();
    }
}
