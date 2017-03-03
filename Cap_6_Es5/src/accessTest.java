import sun.util.calendar.LocalGregorianCalendar;

/**
 * Programma per creato per testare i diversi tipo di accesso a valori e metodi
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe Human contenente
 *  Name : nome della persona di tipo pubblico
 *  Surname : cognome della persona di tipo privato
 *  sex : sesso della persona di tipo enum e privato ed accessibile tramite funzioni di accesso
 *  isNicePerson : booleano che identifica se si tratta di una brava persona o meno di tipo protetto
 *  livingStreet : strada in cui vive la persona di tipo package-access
 */
class Human {
    public String Name;
    public String Surname;

    private HumanSex sex;
        public HumanSex getSex() {
            return sex;
        }
        public void setSex(HumanSex sex) {
            this.sex = sex;
        }

    protected boolean isNicePerson = true;
    String livingStreet;
}

/**
 * Enumeratore che identifica il sesso della persona
 */
enum HumanSex{
    MALE, FEMALE
}
public class accessTest {
    /**
     * Punto d'ingresso del programma
     * @param args Array di stringhe che contiene i valori passati all'utente da terminale al momento dell'avvio del programma
     */
    public static void main(String[] args) {
        /**
         * Creazione di un oggetto di tipo Human
         */
        Human thatGuy = new Human();

        /**
         * Test di assegnazione dei valori
         */
        thatGuy.Name = "Pinco";
        thatGuy.Surname = "Pallino";
        thatGuy.isNicePerson = false;
        thatGuy.setSex(HumanSex.MALE);
        thatGuy.isNicePerson = false;
        thatGuy.livingStreet = "Via Roma, 40";
        //thatGuy.sex = HumanSex.FEMALE; //Test access to private argument

    }
}
