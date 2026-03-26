package EventSystem;

import java.util.ArrayList;

public class EventSystem {

    // Instance variables
    private ArrayList<String> events;
    private String systemName;
    private int maxEvents;

    // Empty constructor
    public EventSystem() {
        this.events = new ArrayList<>();
        this.systemName = "Campus Event System";
        this.maxEvents = 100;
    }

    // Method to add event
    public void addEvent(String eventName) {
        if (events.size() < maxEvents) {
            events.add(eventName);
            System.out.println("Event added: " + eventName);
        } else {
            System.out.println("Cannot add more events. Limit reached.");
        }
    }

    // Method to remove event
    public void removeEvent(String eventName) {
        if (events.contains(eventName)) {
            events.remove(eventName);
            System.out.println("Event removed: " + eventName);
        } else {
            System.out.println("Event not found.");
        }
    }

    // Method to display events
    public void displayEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (int i = 0; i < events.size(); i++) {
                System.out.println((i + 1) + ". " + events.get(i));
            }
        }
    }

    // Method returning value
    public int getEventCount() {
        return events.size();
    }

    // Getter
    public String getSystemName() {
        return systemName;
    }

    // Setter
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

     public void start() {
        // Start function 
        //should guide through what does Student Module do, or help with 
        System.out.println(">> EventSystem Management Module <<");
    }
}
