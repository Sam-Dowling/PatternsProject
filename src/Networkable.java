
abstract class Networkable implements NetworkClient{
    private ConnectionAdapter connectionAdapter;

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

    void print(String printerData, Printer printer){
        printer.printPage(printerData);
    }

    @Override
    public void connect(Router r, ConnectionType connectionType) {
        switch(connectionType){
            case ETHERNET:
                System.out.println("Connecting Through Ethernet");
                break;

            case NFC:
            case WIFI:
                connectionAdapter = new ConnectionAdapter(connectionType);
                connectionAdapter.connect(r, connectionType);
                break;
        }

    }
}
