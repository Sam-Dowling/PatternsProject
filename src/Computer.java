
public class Computer extends Networkable{

    Computer(){

    }

    public void connect(Router r){
        connect(r, ConnectionType.ETHERNET);
        this.setIP(r.registerClient(this));
    }
}
