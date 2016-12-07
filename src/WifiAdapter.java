
public class WifiAdapter implements AdvancedNetworkClient{

    @Override
    public void connectWifi(Router r) {
        System.out.println("Connecting through WiFi.");
    }

    @Override
    public void connectNFC(Router r) {
        // do nothing
    }
}
