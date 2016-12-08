
abstract class OperatingSystem extends Networkable{
    Applications apps;

    abstract void initializeApplications();
    abstract void showWelcomeMessage();
    abstract void connectToNetwork(Router r);


    public final void startOS(Router r){
        showWelcomeMessage();
        connectToNetwork(r);
        initializeApplications();
    }


}
