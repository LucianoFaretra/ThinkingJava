/** Il software gestisce la creazione e cancellazione di oggetti relativi alle taniche stoccate. Se una tanica è ancora
 * piena non potrà essere smaltita.
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Oggetto tanica composto da capacità della tanica e tipologia di liquido ammesso
 */
class Tank{
    float litersLiquidInside;
    private boolean fuelAllowed;

    /**
     * Inizializzatore parametrizzato
     * @param capacityLiterTank Setting capacità manuale della tanica
     * @param fuelIsAllowenInTank Setting tipologia di liquido ammesso
     */
    Tank(float capacityLiterTank, boolean fuelIsAllowenInTank){
        litersLiquidInside = capacityLiterTank;
        fuelAllowed = fuelIsAllowenInTank;
    }

    /**
     * Inizializzatore di default con impostazioni fisse, 5 litri e non accetta combustibili
     */
    Tank(){this(5, false);}

    /**
     * Funzione di simulazione della cancellazione forzata di un oggetto, solo se la tanica è vuota
     */
    protected void finalize(){
        if(litersLiquidInside == 0){
            System.out.println("Simulazione invocazione di finalize");
            System.out.println("Oggetto finalizzato con successo");

        }
        else{
            System.out.println("Impossibile eliminare la tanica, vi è ancora liquido all'interno");
        }
    }
}
public class TankMagazine {
    /**
     * Punto d'inizio del programma
     * @param args Stringa di caratteri passati al momento dell'avvio del programma, ignorati dall'implementazione
     */
    public static void main(String[] args){
        /**
         * Creazione dell'oggetto tanica di olio standard con inizializzatore di default
         */
        Tank fustoOlioStandard = new Tank();

        System.out.println("Tentativo di cancellazione di una tanica piena");
        fustoOlioStandard.finalize();

        System.out.println("Svuotamento tanica");
        fustoOlioStandard.litersLiquidInside = 0;
        System.out.println("Tentativo di cancellazione della tanica");
        fustoOlioStandard.finalize();

    }
}
