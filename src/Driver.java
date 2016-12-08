
public class Driver {

    public static void main(String[] args) {
        Router home = new Router();

        Phone samsung = new Phone(home);
        Computer dell = new Computer(home);

        samsung.os.send("Hello", dell.os);
        dell.os.send("Hello Everyone", home); //broadcast message

        Printer lexmark = Printer.getInstance();
        lexmark.print("Test Print");

        DNS googleDNS = new DNS(home);
        googleDNS.add("www.samsung.com", samsung.os.getIP());
        googleDNS.add("www.dell.com", dell.os.getIP());

        Query dnsQuery = new ProxyDNSQuery("www.samsung.com", googleDNS);
        dnsQuery.displayIP();

    }


}
