public class DHCP{

    private final String ipBase = "192.168.1";

    private int[] range;
    private int assigned;

    public DHCP(){
        this.range = new int[]{0,255};
        this.assigned = 0;
    }

    public String getFreeIP(){
        return String.format("%s.%d", this.ipBase, incrementIP());
    }

    private int incrementIP(){
        return assigned = (++assigned > range[1]) ? range[0] : assigned++;
    }

}
