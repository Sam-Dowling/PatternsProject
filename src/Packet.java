class Packet {


    private final String senderIP;
    private final String receiverIP;
    private final String payload;
    private final PacketType packetType;

    public Packet(String payload, String sender, String recipient){
        this.senderIP = sender;
        this.receiverIP = recipient;

        if(payload.length() > 10){ // If a packet is "too big" to fit into a UDP packet
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




