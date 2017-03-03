/**
 * Definite due classi si tenta di accedere a classi protette dallo stesso package
 * @author Luciano Faretra
 * @version 0.1
 */
class Airplane{
    protected String name;
    private int idCode;
        protected int getidCode(){return idCode;}
    protected boolean itFly;
    static private int i;
    Airplane(){
        name = "NotDefinedYet";
        idCode = (i + 1); i++;//Set new idCode to plane add 1 to default code
        itFly = false;
    }
    public static void planePresentation(Airplane thePlane){
        System.out.println("Defined new plane with idCode: " + thePlane.getidCode() );
        System.out.println("Name: " + thePlane.name);
        System.out.println("Actually is flying?: " + thePlane.itFly);
        System.out.println();
    }public static void planeInformation(Airplane thePlane){
        System.out.println("Information about plane with idCode: " + thePlane.getidCode() );
        System.out.println("Name: " + thePlane.name);
        System.out.println("Actually is flying?: " + thePlane.itFly);
        System.out.println();
    }
}

class RepairHangar{
    private String hangarName;
        public String getHangarName() {return hangarName;}
        public void setHangarName(String hangarName) {this.hangarName = hangarName;}

    RepairHangar(){
            hangarName = "NotSetYet";

    }
    void setOnGround(Airplane airplane){
        airplane.itFly = false;
    }
    void setOnFly(Airplane airplane){
        airplane.itFly = true;
    }
    void changeName(Airplane airplane, String newName){
        airplane.name = newName;
    }

}
public class protectAccess {
    public static void main(String[] args){
        RepairHangar hub1 = new RepairHangar();
        Airplane first = new Airplane();

        Airplane.planePresentation(first);//Presenting the newest plane

        //Start personalizing
        hub1.changeName(first, "SuperJet");
        hub1.setOnFly(first);

        Airplane.planeInformation(first);//Re presenting after some modifications

        Airplane second = new Airplane();//Create second plane
        Airplane.planePresentation(second);//Presenting the new plane

        //Start personalizing
        hub1.changeName(second, "SuperJet");
        hub1.setOnFly(second);

    }


}
