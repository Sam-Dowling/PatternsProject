
public class Firefox extends WebBrowser{

    Firefox(){
        this.setName("Firefox");
    }

    @Override
    public void start() {
        System.out.println("Firefox Started!");
        browseInternet();
    }

}
