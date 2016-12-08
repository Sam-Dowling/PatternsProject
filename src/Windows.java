
public class Windows extends OperatingSystem {

    @Override
    void showWelcomeMessage() {
        System.out.println("Welcome to Windows");
    }

    @Override
    void connectToNetwork(Router r) {
        connect(r, ConnectionType.ETHERNET);
    }
}
