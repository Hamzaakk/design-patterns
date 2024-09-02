package CreationDP.Singleton;

public class App {
    public static void main(String[] args) {
        Journal journal = Journal.getInstance();
        journal.setLog("this is the first log");
        journal.setLog("this is the second log");
        journal.displayLogs();
        Journal journal2 = Journal.getInstance();
        journal.setLog("this is the third log");
        System.out.println("******************");
        journal2.displayLogs();
    }
}
