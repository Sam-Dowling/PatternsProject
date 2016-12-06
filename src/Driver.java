
public class Driver {

    public static void main(String[] args) {
        Router home = new Router();

        Phone samsung = new Phone();
        samsung.connect(home);

        Computer dell = new Computer();
        dell.connect(home);

        samsung.send("hello", dell);

//        Printer brother = new Printer();
//        brother.connect();
//
//        samsung.print("Test Print");
//
//        dell.resolve("www.example.com");


//        samsung.setProxy();
//        samsung.send("hello", dell);
    }


}
