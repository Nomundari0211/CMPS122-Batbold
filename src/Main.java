public class Main {
    public static void main(String[] args) {
        NotificationSystem ns = new NotificationSystem(
            "student001", 
            "Your GPA has been updated.", 
            "Academic", 
            "2026-04-02"
        );
        ns.start();
        ns.markAsRead();
    }
}
