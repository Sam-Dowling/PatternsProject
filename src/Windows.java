
class Windows extends OperatingSystem {

    @Override
    void initializeApplications() {
        ApplicationBuilder appBuilder = new ApplicationBuilder();
        this.apps = appBuilder.computerApplications();
    }

    @Override
    void showWelcomeMessage() {
        System.out.println("Welcome to Windows");
    }

    @Override
    void connectToNetwork(Router r) {
        connect(r, ConnectionType.ETHERNET);
    }

}
