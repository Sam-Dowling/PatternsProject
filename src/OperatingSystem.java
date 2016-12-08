
abstract class OperatingSystem extends Networkable{
    abstract void showWelcomeMessage();
    abstract void connectToNetwork(Router r);

    public final void startOS(Router r){
        showWelcomeMessage();
        connectToNetwork(r);
    }
}
