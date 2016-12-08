
public class Chrome extends WebBrowser{

    Chrome(){
        this.setName("Chrome");
    }

    @Override
    public void start() {
        System.out.println("Chrome Started!");
    }
}
