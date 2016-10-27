public abstract class Packet {

    private enum type;

    String senderIP;
    String receiverIP;

    String payload;


    public packetType getType(){
        return this.type;
    }

    public String getPayload(){
        return this.payload;
    }


}
