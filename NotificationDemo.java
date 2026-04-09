// Superclass
class Notifier {

    
    public void send(String message) {
        System.out.println("General Alert: " + message);
      
        sendPrivate(message);
    }

   
    protected void send(String message, String email) {
        System.out.println("Email Alert to " + email + ": " + message);
    }

    
    void send(String message, long phoneNumber) {
        System.out.println("SMS Alert to " + phoneNumber + ": " + message);
    }

   
    private void sendPrivate(String message) {
        System.out.println("Private Internal Log: " + message);
    }
}

// Subclass
class AppNotifier extends Notifier {

    public void demonstrateAccess() {
        
        send("System is up!");

        
        send("System down!", "admin@example.com");

        
        send("Low battery!", 9876543210L);

    }
}


public class NotificationDemo {
    public static void main(String[] args) {
        AppNotifier appNotifier = new AppNotifier();

       
        appNotifier.demonstrateAccess();

        
        appNotifier.send("Update available!");
        appNotifier.send("Critical error!", "support@example.com");
        appNotifier.send("Recharge soon!", 1234567890L);
    }
}
