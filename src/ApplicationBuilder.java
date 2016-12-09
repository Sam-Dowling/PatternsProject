
class ApplicationBuilder {

    public Applications computerApplications(){
        Applications apps = new Applications();

        // List of Computer applications
        apps.addApp(new Firefox());

        return apps;
    }

    public Applications mobileApplications(){
        Applications apps = new Applications();

        // List of Mobile applications
        apps.addApp(new Chrome());

        return apps;
    }
}
