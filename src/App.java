import Constants.Constants;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println(Constants.ONBOARDING_TEXT);
        try (Scanner getInput = new Scanner(System.in)) {
            System.out.print(Constants.USER_OPTION);

            String userSelect = getInput.nextLine();
            if (userSelect.equals("6")) {
                return;
            } else {
                System.out.println("great choice");
            }
        }
    }
}