/**QUesto programma serve per testare la funzionalità delle variabili statiche presenti in una classe
 * @author Luciano Faretra
 * @version 0.1
 */

/**La classe pubblica staticTest è composta dalle seguenti componenti
 * @param name Nome ID dell'utente
 * @param staticIntAge età minima che consenta l'accesso al servizio
 */
public class staticTest {
    public String name = "None";
    public static int staticIntAge = 8;

    /**Punto d'ingresso per la classe che consente l'esecuzione del programma
     * @param args Parametri passati da linea di comando al programma in esecuzione
     * @param user1 Utente test 1
     * @param user2 Utente test 2
     */
    public static void main(String[] args) {
        staticTest user1 = new staticTest();
        staticTest user2 = new staticTest();

        user1.name = "Paolo";
        user2.name = "Marco";

        System.out.print("Il nome dell'user1 è >: ");
        System.out.println(user1.name);
        System.out.print("L'età minima consentita per l'user1 è >: ");
        System.out.println(user1.staticIntAge);

        System.out.print("Il nome dell'user2 è >: ");
        System.out.println(user2.name);
        System.out.print("L'età minima consentita per l'user2 è >: ");
        System.out.println(user2.staticIntAge);
        System.out.println();

        staticIntAge++;

        System.out.println("L'età minima per gli utenti è stata incrementata di uno!");
        System.out.println();

        System.out.print("Il nome dell'user1 è >: ");
        System.out.println(user1.name);
        System.out.print("L'età minima consentita per l'user1 è >: ");
        System.out.println(user1.staticIntAge);

        System.out.print("Il nome dell'user2 è >: ");
        System.out.println(user2.name);
        System.out.print("L'età minima consentita per l'user2 è >: ");
        System.out.println(user2.staticIntAge);

    }
}
