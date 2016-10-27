
public class Driver {

    public static void main(String[] args) {

        DNS dns = new DNS();

        Router router = new Router(dns);

        Computer computer_a = new Computer();
        computer_a.connect(router);

        Computer computer_b = new Computer();
        computer_b.connect(router);


        String destination_ip = computer_b.getIP();

        computer_a.sendPacket("Hello", destination_ip);







        /*

        String payload = "Hello";

        String destination_hostname = "www.google.com";

        String destination_address = dnslookup(hostname);

        send(destination_address, TCPPacket, payload);
        */


    }


}
