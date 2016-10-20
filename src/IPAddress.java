import java.util.Arrays;
import java.util.regex.PatternSyntaxException;

public class IPAddress {
    private int[] IPAddress = new int[4];

    IPAddress(String IP){
        try {


            String[] IPString = IP.split("\\.");

            for (int i = 0; i < 4; i++)
                this.IPAddress[i] = Integer.parseInt(IPString[i]);

        } catch (Exception ex) {
            this.IPAddress = new int[]{0, 0, 0, 0};
        }
    }

    IPAddress(int[] IP){
        this.IPAddress = IP;
    }

    public String getIPAsString(){
        String IP = "";

        for(int octet : this.IPAddress)
            IP += "." + octet;

        return IP.substring(1);
    }

    public int[] getIP(){
        return this.IPAddress;
    }
}
