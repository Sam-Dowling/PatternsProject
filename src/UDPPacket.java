
public class UDPPacket extends Packet {

    private enum type = UDP;

    char[] payload;

    public UDPPacket(String senderIP, String receiverIP, String payload){
        this.senderIP = senderIP;
        this.receiverIP = receiverIP;

        this.payload = payload.toCharArray();

    }

    public char[] getPayload(){
        return this.payload;
    }


}
