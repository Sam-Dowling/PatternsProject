import java.util.HashMap;
import java.util.Map;

class DNS extends Networkable{

    private final Map<String, String> dnsEntries = new HashMap<>();

    DNS(Router r) {
        connect(r, ConnectionType.ETHERNET);
    }

    public void add(String hostname, String ipaddress){
        dnsEntries.put(hostname, ipaddress);
    }

    public String get(String hostname){
        return dnsEntries.get(hostname);
    }

}
