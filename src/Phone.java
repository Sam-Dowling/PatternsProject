
public class Phone extends Networkable implements NetworkClient{

    Phone(){

    }

    @Override
    public void connect(Router r) {
        System.out.println(String.format("Connecting to %s Through Wifi", r.getIP()));
        this.setIP(r.assignIP());
    }
}
