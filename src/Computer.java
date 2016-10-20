
public class Computer{
    IPAddress IPAddress;

    public Computer(String IP){
        this.IPAddress = new IPAddress(IP);
    }

    public void sendPacket(Computer receiver){
        receiver.receivePacket(String.format("%s : %s", this.IPAddress.getIPAsString(), "Ping"));
    }

    public void receivePacket(String message){
        System.out.println(message);
    }

}
