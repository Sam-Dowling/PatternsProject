
public class ApplicationBuilder {
    public Applications computerApplications(){
        Applications apps = new Applications();
        apps.addApp(new Firefox());

        return apps;
    }

    public Applications mobileApplications(){
        Applications apps = new Applications();
        apps.addApp(new Chrome());

        return apps;
    }
}
