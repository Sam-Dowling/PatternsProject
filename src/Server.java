
public abstract class Server {
    private String IP;

    public void receivePacket(Packet p){
        if(p.getType().equals("UDP")){
            //implement UDP receive protocol
        }else{
            //implement TCP receive protocol
        }
    }

}
