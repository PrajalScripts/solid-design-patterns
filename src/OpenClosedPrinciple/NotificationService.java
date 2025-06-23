package OpenClosedPrinciple;

class NotificationService {
    public void sendNotification(Notifier notifier, String message) {
        notifier.send(message);
    }
}
