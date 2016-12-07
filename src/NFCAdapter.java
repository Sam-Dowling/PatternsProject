
public class NFCAdapter implements AdvancedNetworkClient{
    @Override
    public void connectWifi(Router r) {
        // do nothing
    }

    @Override
    public void connectNFC(Router r) {
        System.out.println("Connecting through NFC.");
    }
}
