import java.util.HashMap;
import java.util.Map;

public class Applications {
    private Map<String, App> apps = new HashMap<>();

    public void addApp(App app){
        apps.put(app.getName(), app);
    }

    void startApp(String name){
        apps.get(name).start();
    }
}
