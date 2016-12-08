
public class DNSQuery implements Query{

    private String hostname = null;
    private String ipAddress = null;

    public DNSQuery(final String hostname, DNS dnsServer){
        this.hostname = hostname;
        queryDNS(hostname, dnsServer);
    }

    private void queryDNS(String hostname, DNS dnsServer){
        this.ipAddress = dnsServer.get(hostname);
        System.out.println("Querying DNS Server");
    }

    @Override
    public void displayIP() {
        System.out.println(String.format("%s : %s", this.hostname, this.ipAddress));
    }
}
