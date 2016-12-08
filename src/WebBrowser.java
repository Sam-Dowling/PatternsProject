
public abstract class WebBrowser implements App{
    private String name;

    void browseInternet(){
        System.out.println("Browsing Internet");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
