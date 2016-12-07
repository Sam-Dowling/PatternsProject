
public class ConnectionAdapter implements NetworkClient{

    private AdvancedNetworkClient advancedNetworkClient;

    public ConnectionAdapter(ConnectionType type){
        switch (type){
            case WIFI:
                advancedNetworkClient = new WifiAdapter();
                break;

            case NFC:
                advancedNetworkClient = new NFCAdapter();
                break;
        }
    }

    @Override
    public void connect(Router r, ConnectionType connection) {
        switch (connection){
            case WIFI:
                advancedNetworkClient.connectWifi(r);
                break;

            case NFC:
                advancedNetworkClient.connectNFC(r);
                break;
        }

    }
}
