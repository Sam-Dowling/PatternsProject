
public class Driver {

    public static void main(String[] args) {
        /*
        Computer comp1 = new Computer("10.10.10.1");
        Computer comp2 = new Computer("10.10.10.2");

        comp1.sendPacket(comp2);
        */

        IPAddress ip = new IPAddress("123.456.789.123");




        System.out.println(ip.getIPAsString());
    }


}
