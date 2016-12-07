
public class Printer extends Networkable{

    private static Printer singleton = new Printer( );

    private Printer() { }

    public static Printer getInstance(){
        return singleton;
    }

    protected static void printPage(String printData){
        System.out.println(String.format("Printing: %s", printData));
    }


    public void connect(Router r){
        connect(r, ConnectionType.WIFI);
        this.setIP(r.registerClient(this));
    }
}
