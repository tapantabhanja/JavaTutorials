import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {

        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        int calculatedSum = 0;

        while (counter <= 10) {

            System.out.println("Enter number #" + counter + ": ");

            boolean intInputCheck = scanner.hasNextInt();

            if (intInputCheck) {
                int enteredNumber = scanner.nextInt();
                calculatedSum += enteredNumber;
                counter+=1;
            }

            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        scanner.close();
        System.out.println("Result after numbers added: " + calculatedSum);
    }
}
