/**
 * Creazione di due oggetti di tipo dog ed operazioni di stampa su di essi
 * @author Luciano Faretra
 * @version 0.1
 */


/** Classe Dog che definisce un cane */
public class Dog {
    /**
     * nome nome del cane
     */
    public String nome;
    /**
     * verso del cane
     */
    public String verso;

    /**Funzione d'ingresso del programma
     * @param args Stringa contenente le istruzioni passate al programma da terminale
     */
    public static void main(String[] args) {
        /**
         * Primo Oggetto cane
         */
        Dog dog1 = new Dog();
        /**
         * Secondo Oggetto cane
         */
        Dog dog2 = new Dog();

        dog1.nome = "Spot";
        dog1.verso = "Grrrr!";

        dog2.nome = "Scruffy";
        dog2.verso = "Bau!";

        System.out.println("Il nome del primo cane è: " + dog1.nome + "ed il suo verso: " + dog1.verso);
        System.out.println("Il nome del secondo cane è: " + dog2.nome + "ed il suo verso: " + dog2.verso);
    }
}
