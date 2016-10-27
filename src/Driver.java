
public class Driver {

    public static void main(String[] args) {



        Router router = new Router();

        DHCP dhcp = new DHCP(new int[]{0,100});

        Computer computer_a = new Computer();
        computer_a.connect(router);

        Computer computer_b = new Computer();
        computer_b.connect(router);


        /*

        String payload = "Hello";

        String destination_hostname = "www.google.com";

        String destination_address = dnslookup(hostname);

        send(destination_address, TCP, payload);
        */


    }


}
