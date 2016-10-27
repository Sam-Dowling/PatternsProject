
public abstract class NetworkClient {

    public void get_ip_from_dhcp(){

    }

    public void set_dns_server_ip(){

    }

    public void connect(Router router){

    }

    public void receivePacket(Packet p){
        if(p.getType().equals("UDP")){
        //implement UDP receive protocol
        }else{
        //implement TCP receive protocol
        }
    }
}
