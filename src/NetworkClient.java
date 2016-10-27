
public abstract class NetworkClient {

    private String IPAddress;

    public void connect(Router router){
        this.IPAddress = router.assignIP();
    }

    public String getIP(){
        return this.IPAddress;
    }




    public void receivePacket(Packet packet){
        String payload = parsePacket(packet);
        System.out.println(payload);
    }

    private String parsePacket(Packet packet){
        switch(packet.getType()){

            case UDP:
                return new String(packet.getPayload());
                break;

            case TCP:
                return packet.getPayload();
                break;

        }
    }


}
