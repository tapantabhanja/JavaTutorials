import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

//        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int enteredNumber = scanner.nextInt();

//                if (first) {
//                    max = enteredNumber;
//                    min = enteredNumber;
//                    first = false;
//                }

                if (enteredNumber > max) {
                    max = enteredNumber;
                }
                else if (enteredNumber < min) {
                    min = enteredNumber;
                }

            }
            else {
                break;
            }
            scanner.nextLine(); // handle end of Line (enter Key)
        }

        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
        scanner.close();
    }
}

