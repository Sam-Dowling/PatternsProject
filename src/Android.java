
public class Android extends OperatingSystem{

    @Override
    void showWelcomeMessage() {
        System.out.println("Welcome to Android");
    }

    @Override
    void connectToNetwork(Router r) {
        connect(r, ConnectionType.WIFI);
    }
}
