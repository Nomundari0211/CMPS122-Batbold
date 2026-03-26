import java.util.Scanner;

import Constants.Constants;
import DataStorage.DataStorage;
import EventSystem.EventSystem;
import RegistrationManager.RegistrationManager;
import Student.Student;

public class App {
    public static void main(String[] args) {
        // Scan input
        System.out.println(Constants.ONBOARDING_TEXT);
        try (Scanner getInput = new Scanner(System.in)) {
            System.out.print(Constants.USER_OPTION);

            String userSelect = getInput.nextLine();
            // taking acess to Modules
            Student studentModule = new Student();
            RegistrationManager registerationModule = new RegistrationManager();
            EventSystem eventSystem = new EventSystem();
            DataStorage persistenceModule = new DataStorage();



            // MARK: - Handling User Response
           switch (userSelect){
                case "1" -> studentModule.start();
                case "2", "3", "5",  "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "18", "19" -> {
                }
                case "4" -> registerationModule.start();
                case "6" -> eventSystem.start();
                case "17" -> persistenceModule.start();
                case "20" -> System.out.println("sup");
                case "21" -> {
                }
                default -> System.err.print("invalid Selection");
            }
        }
    }
}