/**
 * Creare una classe, poi una seconda classe che richiami la prima ed inizializzi gli elementi della prima con la
 * tecnica lazy initialization
 * @author Luciano Faretra
 * @version 0.1
 */

class SecondClass{
    String Name;
    int age;

    @Override
    public String toString() {
        return Name + age;
    }
}

public class FirstClass {
    

    public static void main(String[] args) {
        SecondClass[] people = new SecondClass[5];

    }
}
