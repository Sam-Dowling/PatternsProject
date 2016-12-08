
public class ProxyDNSQuery implements Query{

    private DNSQuery realDNSQuery = null;

    private String hostname = null;
    private DNS dnsServer = null;

    public ProxyDNSQuery(final String hostname, DNS dnsServer){
        this.hostname = hostname;
        this.dnsServer = dnsServer;
    }

    @Override
    public void displayIP() {
        if(realDNSQuery == null){
            realDNSQuery = new DNSQuery(this.hostname, this.dnsServer);
        }
        realDNSQuery.displayIP();
    }
}
