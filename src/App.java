import Constants.Constants;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println(Constants.OnboardingText);
        Scanner getInput =  new Scanner(System.in);
        System.out.print(Constants.userOption);


        String userSelect = getInput.nextLine();
        if (userSelect.equals("6")) {
            return;
        } else {
            System.out.println("great choice");
        }

    }
}
