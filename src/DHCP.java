

public class DHCP{

    private final String ipBase = "192.168.1"; // maybe implement subnets?

    private int[] range;
    private int assigned;

    public DHCP(int[] range){
        this.range = range;
        this.assigned = range[0];
    }

    public String getFreeIpAddress(){
        return String.format("%s.%d", this.ipBase, incrementIP());
    }

    private int incrementIP(){
        return assigned = (++assigned > range[1]) ? range[0] : assigned++;
    }

}
