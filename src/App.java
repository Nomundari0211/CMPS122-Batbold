import Constants.Constants;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Scan input
        System.out.println(Constants.ONBOARDING_TEXT);
        try (Scanner getInput = new Scanner(System.in)) {
            System.out.print(Constants.USER_OPTION);

            String userSelect = getInput.nextLine();

            // MARK: - Handling User Response
           switch (userSelect){
                case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" -> {
                }
                case "20" -> System.out.println("sup");
                case "21" -> {
                }
                default -> System.err.print("invalid Selection");
            }
        }
    }
}