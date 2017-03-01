/** Test della funzione this
 * @author Luciano Faretra
 * @version 0.1
 */
public class MethodTest {
    public void method1(){
        /**
         * Invocazione tramite this implicito
         */
        method2();
        /**
         * Invocazione tramite this esplicito
         */
        this.method2();
    }
    public void method2(){
    }

    public static void main(String[] args) {
        MethodTest test = new MethodTest();

        test.method1();
    }
}
