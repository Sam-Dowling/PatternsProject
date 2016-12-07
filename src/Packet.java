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

interface PacketType{
    String packData(String data);
    String unpackData(String data);
}


class TCPPacketType implements PacketType{

    @Override
    public String packData(String data) {
        return String.format(":TCP:%s:TCP:", data);
    }

    @Override
    public String unpackData(String data) {
        return data.replaceAll(":TCP:", "");
    }
}

class UDPPacketType implements PacketType{

    @Override
    public String packData(String data) {
        return String.format(":UDP:%s:UDP:", data);
    }

    @Override
    public String unpackData(String data) {
        return data.replaceAll(":UDP:", "");
    }
}