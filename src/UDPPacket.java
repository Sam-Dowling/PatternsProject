
public class UDPPacket extends Packet {

    private PacketType type = PacketType.UDP;

    char[] payload;

    public UDPPacket(String senderIP, String receiverIP, String payload){
        this.senderIP = senderIP;
        this.receiverIP = receiverIP;

        this.payload = payload.toCharArray();

    }

    public String getPayload(){
        return new String(this.payload);
    }


}
