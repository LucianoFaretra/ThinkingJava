/**
 * Creazione di due oggetti di tipo dog ed operazioni di confronto tra essi
 * @author Luciano Faretra
 * @version 0.1
 */


/** Classe Dog che definisce un cane
 *
 */
public class Dog {
    /**
     * Nome del cane
     */
    public String nome;
    /**
     * Verso del cane
     */
    public String verso;

    /**Funzione d'ingresso del programma
     * @param args Stringa contenente le istruzioni passate al programma da terminale
     */
    public static void main(String[] args) {
        /**
         * Instanza un oggetto di tipo cane
         */
        Dog dog1 = new Dog();
        /**
         * Instanza di un secondo oggetto di tipo cane
         */
        Dog dog2 = new Dog();

        dog1.nome = "Spot";
        dog1.verso = "Grrrr!";

        dog2.nome = "Scruffy";
        dog2.verso = "Bau!";

        dog2 = new Dog();

        System.out.print("Gli oggetti dog1 e dog2 sono uguali? >: " + dog1.equals(dog2));

    }
}
