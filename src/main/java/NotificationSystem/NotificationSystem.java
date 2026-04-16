// Nomundari Batbold
package NotificationSystem;
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
        inbox.add("[UNREAD] [" + notificationType + "] " + message + " (" + timestamp + ")");
        System.out.println("Notification sent to " + recipientId + ": " + message);
    }

    public int getUnreadCount() {
        int count = 0;
        for (String msg : inbox) {
            if (msg.startsWith("[UNREAD]")) {
                count++;
            }
        }
        return count;
    }

    public void displayInbox() {
        if (inbox.isEmpty()) {
            System.out.println("Inbox is empty.");
        } else {
            System.out.println("\n==== Inbox for " + recipientId + " ====");
            for (String msg : inbox) {
                System.out.println(msg);
            }
        }
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

    public void showMenu() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n==== Notification System Menu ====");
            System.out.println("1. Send Notification");
            System.out.println("2. View Inbox");
            System.out.println("3. Mark as Read");
            System.out.println("4. Get Unread Count");
            System.out.println("0. Return");
            System.out.print("Enter choice: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: sendNotification(); break;
                    case 2: displayInbox(); break;
                    case 3: markAsRead(); break;
                    case 4: System.out.println("Unread messages: " + getUnreadCount()); break;
                    case 0: System.out.println("Returning..."); break;
                    default: System.out.println("Invalid option! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                scanner.next();
            }
        }
    }
}