public class Packet {

    private String senderIP;
    private String receiverIP;
    private String payload;

    public Packet(String data, String sender, String recipient){
        this.senderIP = sender;
        this.receiverIP = recipient;
        this.payload = data;
    }


    public String getSenderIP() {
        return senderIP;
    }

    public String getReceiverIP() {
        return receiverIP;
    }

    public String getPayload() {
        return payload;
    }
}
