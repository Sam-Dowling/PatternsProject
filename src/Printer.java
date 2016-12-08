
public class Printer{

    private static Printer singleton = new Printer( );

    private Printer() { }

    static Printer getInstance(){
        return singleton;
    }

    protected static void print(String printData){
        System.out.println(String.format("Printing: %s", printData));
    }

}
