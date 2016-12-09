class Printer{

    private static final Printer singleton = new Printer( );

    private Printer() { }

    static Printer getInstance(){
        return singleton;
    }

    static void print(String printData){
        System.out.println(String.format("Printing: %s", printData));
    }

}