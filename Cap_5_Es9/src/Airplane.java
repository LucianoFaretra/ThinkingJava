/**Test di costruttori incapsulati in altri costruttori
 * @author Luciano Faretra
 * @version 0.1
 */

/**
 * Definizione della classe Airplane
 */
public class Airplane {
    int tankNumber;
    String fuel;

    /**
     * Costruttore di default di Airplane
     */
    Airplane(){
        this(1, "Standard Avionic Fuel");
        System.out.println("Standard constructor with no arguments");
    }

    /**
     * Costruttore con definizione del numero di serbatoi
     * @param fuelTankNumber numero intero di sperbatoi
     */
    Airplane(int fuelTankNumber) {
        tankNumber = fuelTankNumber;
        System.out.println("Constructor w/ fuel tank number only, tankNumber= " + tankNumber);
    }

    /**
     * Costruttore con la pecifica del tupo di carburante caricato a bordo
     * @param fuelType tipo di carburante caricato a bordo
     */
    Airplane(String fuelType) {
        fuel = fuelType;
        System.out.println("Constructor w/ fuel type only, fuel= " + fuelType);
    }

    /**
     * Costruttore con la specifica sia del tipo di carburante caricato a bordo che del numero di serbatoi
     * @param fuelTankNumber Numero di serbatoi presenti a bordo
     * @param fuelType Tipo di benzina caricata a bordo dell'aereo
     */
    Airplane(int fuelTankNumber, String fuelType) {
        this.tankNumber = fuelTankNumber;
        this.fuel = fuelType;
        System.out.println("Constructor w/ fuel type, fuel= " + fuelType + " and tankNumber= " + tankNumber);
    }
    public static void main(String[] args) {
        /**
         * Creazione dell'aereo boing 747 e relativa configurazione
         */
        Airplane boing747 = new Airplane(3, "Low Emission Impact Fuel");
        /**
         * Creazione dell'aereo boing 727 e relativa configurazione
         */
        Airplane boing727 = new Airplane(2, "Special Speed Fuel");
    }
}
