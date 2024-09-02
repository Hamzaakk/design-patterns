package CreationDP.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Journal {


    private static Journal instance;
    private static List<String> logs = new ArrayList<String>();
    private Journal() {}


    public static Journal getInstance() {
        if (instance == null) {
            instance = new Journal();
        }
        return instance;
    }


    public void setLog(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }

    public void displayLogs() {
        for(String log : logs) {
            System.out.println(log);
        }
    }

}
