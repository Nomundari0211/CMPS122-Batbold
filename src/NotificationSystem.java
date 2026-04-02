// Nomundari Batbold

import java.util.ArrayList;

public class NotificationSystem {

    private String recipientId;
    private String message;
    private String notificationType;
    private String timestamp;
    private boolean isRead;
    private ArrayList<String> inbox;

    public NotificationSystem(String recipientId, String message, String notificationType, String timestamp) {
        this.recipientId = recipientId;
        this.message = message;
        this.notificationType = notificationType;
        this.timestamp = timestamp;
        this.isRead = false;
        this.inbox = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public void sendNotification() {
        // logic coming soon
    }

    public int getUnreadCount() {
        // logic coming soon
        return 0;
    }

    public void displayInbox() {
        // logic coming soon
    }

    public void markAsRead() {
        if (!isRead) {
            isRead = true;
            System.out.println("Notification marked as read: " + message);
        } else {
            System.out.println("Already read.");
        }
    }

    public void start() {
        System.out.println("Welcome to the Notification System!");
        System.out.println("Recipient: " + recipientId);
        System.out.println("You have a new " + notificationType + " notification.");
    }
}
