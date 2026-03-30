package HelpMenu;

public class HelpMenu {
    // PROPERTIES
    private String currentTopic; // text data type
    private String[] menuOptions;
    private String[] helpContent;

    // CONSTRUCTOR
    public HelpMenu() {
        // Initialize the help topics and content as required by the module
        this.menuOptions = new String[]{"Student Help", "Course Help", "Payment Help"};
        this.helpContent = new String[]{
                "Use the Student module to manage and update profile details.",
                "Use the Course module to register for new classes or view rosters.",
                "Use the Payment Processing module to track balances and history."
        };
        this.currentTopic = "General Help";
    }

    // METHODS

    // Displays the welcome/intro screen
    public void displayWelcome() {
        System.out.println("Welcome to the CampusConnect 2.0 Help System!");
    }

    // Prints all available help topics
    public void listTopics() {
        System.out.println("Available Help Topics:");
        // Week 2: Add a loop to print each option from menuOptions [cite: 38]
    }

    // Shows help based on topic using a switch statement
    public void displayHelp(String choice) {
        // Week 2 Goal: Implement the switch logic here [cite: 30, 38]
        // Reminder: Use .equals() for String comparison [cite: 22, 44]
        System.out.println("Displaying help for: " + choice);
    }

    // Finds help by keyword
    public void searchHelp(String keyword) {
        System.out.println("Searching help for keyword: " + keyword);
    }

    public void start() {
        displayWelcome();
    }
}
