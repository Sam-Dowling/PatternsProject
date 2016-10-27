
public class TCPPacket extends Packet {

    private enum type = TCP;


    public TCPPacket(String senderIP, String receiverIP, String payload){
        this.senderIP = senderIP;
        this.receiverIP = receiverIP;

        this.payload = payload;

    }

}
