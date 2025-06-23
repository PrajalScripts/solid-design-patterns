package OpenClosedPrinciple.voilation;

class ViolatedNotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}

// Adding a new type needs modification = violation of OCP....
