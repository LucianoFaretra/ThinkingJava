/**
 * La classe ConnectionManager gestisce un array fisso di oggetti Connection. Al programmatore client non dovrà
 * essere possibile creare esplicitamente oggetti Connection, ma potrà ottenerli solo per mezzo di un metodo static di
 * ConnectionManager; qualora il ConnectionManager esaurisca gli oggetti, restituirà un riferimento nullo.
 */

class Connection {
    private static int counterConnections = 0;
    private int id = counterConnections++;
    Connection() {}
    int getId(){return counterConnections;}
}

class ConnectionManagerAllocator {
    private static Connection[] arrayConnections = new Connection[10];
    private static int counterConnections = 0;
    static {
        for(int i = 0; i < arrayConnections.length; i++)
            arrayConnections[i] = new Connection();
    }
    public static Connection getConnection() {
        if(counterConnections < arrayConnections.length)
            return arrayConnections[counterConnections++];
        return null;
    }
}

public class ConnectionManager {
    public static void main(String args[]) {
        Connection c = ConnectionManagerAllocator.getConnection();
        while(c != null) {
            System.out.println("Creata nuova connessione");
            c = ConnectionManagerAllocator.getConnection();
        }
    }
}