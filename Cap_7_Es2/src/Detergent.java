/**
 * Created by Luciano Faretra on 26/04/17.
 */
public class Detergent extends Cleanser {
    final public void scrub(){
        append(" Detergent.scrub()");
        super.scrub(); //Superclass constructor
    }
    //Aggiungi metodi all'interfaccia:
    public void foam() {append(" foam()");}
    //Test della nuova classe:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.diluite();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

