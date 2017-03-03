package Test2;
import Test.Dog;

/**
 * Secondo package per testare le classi protected e private
 * @author Luciano Faretra
 * @version 0.1
 */
class Cat extends Dog { //Estensione della classe Dog, il costruttore è pubblic e può essere usato in un'altro package
    boolean isCute = true;
}


public class DifferentPackage {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        //cat1.petting(); //Test accesso ad un metodo protetto di un'alatro package, quindi non può essere usato

    }
}
