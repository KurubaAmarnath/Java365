abstract class Notification {
    abstract void send();
    void showStatus() {
        System.out.println("Notification system is active");
    }
}
interface NotificationLogger {
    void log();
}
class EmailNotification extends Notification
        implements NotificationLogger {
    @Override
    void send() {
        System.out.println("Sending email notification");
    }
    @Override
    public void log() {
        System.out.println("Email notification logged");
    }
}
public class Oct27 {
    public static void main(String[] args) {

        EmailNotification email = new EmailNotification();

        email.showStatus();
        email.send();
        email.log();
    }
}