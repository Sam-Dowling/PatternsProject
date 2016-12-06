
public class Computer extends Networkable implements NetworkClient {

    Computer(){

    }

    @Override
    public void connect(Router r) {
        System.out.println(String.format("Connecting to %s Through Ethernet", r.getIP()));
        this.setIP(r.assignIP());
    }
}
