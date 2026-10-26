class Notification {
    void send() {
        System.out.println("Sending a notification");
    }
}
class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
    void showEmailAddress() {
        System.out.println("Email: user@example.com");
    }
}
class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}
public class Oct26 {
    public static void main(String[] args) {

        // Upcasting
        Notification notification = new EmailNotification();
        notification.send();

        // Downcasting
        if (notification instanceof EmailNotification) {
            EmailNotification email = (EmailNotification) notification;
            email.showEmailAddress();
        }
        // Another child object
        notification = new SMSNotification();
        notification.send();
    }
}