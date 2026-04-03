import java.util.Scanner;

import Constants.Constants;
import CourseModule.CourseModule;
import DataStorage.DataStorage;
import ErrorHandling.ErrorHandling;
import EventSystem.EventSystem;
import FinancialAid.FinancialAid;
import HelpMenu.HelpMenu;
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
            HelpMenu helpMenu = new HelpMenu();
            ErrorHandling errorHandling = new ErrorHandling();
            CourseModule courseModule = new CourseModule();
            FinancialAid financialAid = new FinancialAid();




            // MARK: - Handling User Response
           switch (userSelect){
                case "1" -> studentModule.start();
                case "3", "5",  "7", "9", "10", "11", "12", "13", "15", "16" -> {
                }
                case "2" -> courseModule.start();
                case "4" -> registerationModule.start();
                case "6" -> eventSystem.start();
                case "8" -> financialAid.start();
                case "14" -> courseModule.start();
                case "17" -> persistenceModule.start();
                case "18" -> helpMenu.start();
                case "19" -> errorHandling.start();
                case "20" -> System.out.println("sup");
                case "21" -> {
                }
                default -> System.err.print("invalid Selection");
            }
        }
    }
}