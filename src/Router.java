import java.util.ArrayList;
import java.util.List;

class Router extends Networkable {

    private final DHCP dhcp;
    private final List<Networkable> clients = new ArrayList<>();

    Router(){
        this.dhcp = new DHCP();
        this.setIP(dhcp.getFreeIP());
    }

    String registerClient(Networkable client){
        clients.add(client);
        return dhcp.getFreeIP();
    }

    void receive(Packet p){
        for (Networkable client : clients) {
            client.receive(p);
        }
    }
}
