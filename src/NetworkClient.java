
public abstract class NetworkClient {

    private String IPAddress;

    public void connect(Router router){
        this.IPAddress = router.assignIP();
    }

    public String getIP(){
        return this.IPAddress;
    }




    public void receivePacket(Packet packet){
        String payload = packet.getPayload();
        System.out.println(payload);
    }


}
