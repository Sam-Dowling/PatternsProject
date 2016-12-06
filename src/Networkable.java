
abstract class Networkable{
    private String IP;

    void setIP(String ip) {
        this.IP = ip;
    }

    String getIP(){
        return this.IP;
    }

    void send(String data, Networkable recipient){
        Packet p = new Packet(data, this.IP, recipient.getIP());
        recipient.receive(p);
    }

    void receive(Packet p){
        System.out.println(String.format("\"%s\" received from %s", p.getPayload(), p.getSenderIP()));
    }
}
