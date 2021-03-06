import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {

            System.out.println("Enter a number: ");

            boolean intCheck = scanner.hasNextInt();

            if (intCheck) {

                int number = scanner.nextInt();
                sum += number;
                counter += 1;

                avg = Math.round((double) sum/(double) counter);

            }

            else {

                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine(); // Handle the Input.
        }
        scanner.close();
    }

}
