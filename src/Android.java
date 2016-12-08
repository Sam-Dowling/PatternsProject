
public class Android extends OperatingSystem{

    @Override
    void initializeApplications() {
        ApplicationBuilder appBuilder = new ApplicationBuilder();
        this.apps = appBuilder.mobileApplications();
    }

    @Override
    void showWelcomeMessage() {
        System.out.println("Welcome to Android");
    }

    @Override
    void connectToNetwork(Router r) {
        connect(r, ConnectionType.WIFI);
    }

}
