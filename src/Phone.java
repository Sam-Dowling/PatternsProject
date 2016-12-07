
public class Phone extends Networkable{

    Phone(){

    }

    public void connect(Router r){
        connect(r, ConnectionType.NFC);
        this.setIP(r.registerClient(this));
    }
}
