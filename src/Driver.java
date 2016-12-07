
public class Driver {

    public static void main(String[] args) {
        Router home = new Router();

        Phone samsung = new Phone();
        samsung.connect(home);

        Computer dell = new Computer();
        dell.connect(home);

        samsung.send("hello", dell);

        dell.send("Hello There", home);

        Printer lexmark = Printer.getInstance();
        lexmark.connect(home);


        samsung.print("Test Print", lexmark);
//
//        dell.resolve("www.example.com");


//        samsung.setProxy();
//        samsung.send("hello", dell);
    }


}
