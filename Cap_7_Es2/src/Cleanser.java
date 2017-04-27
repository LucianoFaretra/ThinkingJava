/**
 * Created by LucianoFaretra on 26/04/17.
 */
public class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a;}
    public void diluite() { append(" diluite()");};
    public void apply() { append(" apply()");}
    public void scrub() { append(" scrub()");}
    public String toString() { return s;}
    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.diluite(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
