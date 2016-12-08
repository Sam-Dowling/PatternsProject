public class Packet {


    private String senderIP;
    private String receiverIP;
    private String payload;
    private PacketType packetType;

    public Packet(String payload, String sender, String recipient){
        this.senderIP = sender;
        this.receiverIP = recipient;

        if(payload.length() > 10){
            this.packetType = new TCPPacketType();
        }else{
            this.packetType = new UDPPacketType();
        }

        this.payload = this.packetType.packData(payload);
    }


    String getSenderIP() {
        return senderIP;
    }

    public String getReceiverIP() {
        return receiverIP;
    }

    String getPayload(){
        return packetType.unpackData(this.payload);
    }

}




