import java.util.Date;

/**Il programma crea un oggetto ed invoca il metodo finalize() sempre e comunque
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Classe Airplane, il cui oggetto è formato dal nome dell'aereoplano e la data di produzione
 */
class Airplane{
    String name;
    String productionDate;

    /**
     * Come costruttore di default viene posto come nome sconosciuto e come data di produzione il primo gennaio del '900
     */
    Airplane(){
        this("unknown", "01/01/1900"); this.finalize();
    };

    /**
     * Costruttore personalizzabile tramite parametri
     * @param nameAirplane Nome dell'aereoplano
     * @param productionDateAirplane Data di produzione dell'aereoplano
     */
    Airplane( String nameAirplane, String productionDateAirplane){
        name = nameAirplane;
        productionDate = productionDateAirplane;
        this.finalize();
    }

    /**
     * Qui viene simulata la finalizzazione forzata dell'oggetto
     */
    protected void finalize(){
        System.out.println("Simulazione Oggetto finalizatto in modo forzato");
    }
}

public class CleaningClass2 {

    /**
     * Punto d'ingresso del programma
     * @param args Stringa passata da terminale come parametro
     */
    public static void main(String[] args){
        System.out.println("Creazione dell'oggetto museumAirplane, il quale verrà finalizzato alla fine del processo");
        Airplane museumAirplane = new Airplane();
    }
}