

public class DHCP extends Server{

    private int port = 1234;

    // 0.0.0.0 - 0.0.0.100
    private int[] range = new int[]{0,100};

    private int[] assigned;

    public String assignIp(){
        //TODO
        return null;
    }

}
