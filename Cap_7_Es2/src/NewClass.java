/**
 * Created by Luciano Faretra on 26/04/17.
 */
public class NewClass extends Cleanser {
    final public void scrub() { append(" Overrited scrub()"); super.scrub();}
    public void sterilize() {append(" sterilize()");}
    public static void main(String[] args) {
        NewClass x = new NewClass();
        x.diluite();
        x.apply();
        x.scrub();
        x.sterilize();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
