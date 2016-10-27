
public class Router extends NetworkClient {

    private DNS dns;
    private DHCP dhcp;

    public Router(DNS dns){
        this.dns = dns;
        this.dhcp = new DHCP(new int[]{0,255});
    }

    public String assignIP(){
        return dhcp.getFreeIpAddress();
    }

}
