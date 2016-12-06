
class Router extends Networkable {

    private DHCP dhcp;

    Router(){
        this.dhcp = new DHCP();
        this.setIP(this.assignIP());
    }

    String assignIP(){
        return dhcp.getFreeIP();
    }

}
