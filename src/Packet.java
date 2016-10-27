public abstract class Packet {

    private PacketType type = PacketType.NONE;

    String senderIP;
    String receiverIP;
    String payload;


    public PacketType getType(){
        return this.type;
    }

    public String getPayload(){
        return this.payload;
    }


}
