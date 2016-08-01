package consoleAppTest;

/**
 * Created by User on 01.08.2016.
 */
public class messangerClass {
    private String message;

    writterLog logPr = new writterLog();

    public void getMessage() {
        logPr.setLogString("Start print message");
        logPr.getLogString();
        System.out.println(message);
        logPr.setLogString("end print message");
        logPr.getLogString();
    }

    public void setMessage(String message) {
        logPr.setLogString("Start set message");
        logPr.getLogString();
        this.message = message;
        logPr.setLogString("End set message");
        logPr.getLogString();
    }
}
