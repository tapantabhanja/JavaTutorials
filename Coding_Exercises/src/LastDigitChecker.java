import java.sql.SQLOutput;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("Output Last Digit Checker: " + hasSameLastDigit(41, 22, 71));
        System.out.println("Output Last Digit Checker: " + hasSameLastDigit(23, 32, 42));
        System.out.println("Output Last Digit Checker: " + hasSameLastDigit(9, 99, 999));

        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Check is Valid: " + isValid(10));
        System.out.println("Check is Valid: " + isValid(468));
        System.out.println("Check is Valid: " + isValid(1051));

        System.out.println("---------------------------------------------------------------------------------");


        System.out.println();
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber < 10 || firstNumber > 1000) || (secondNumber < 10 || secondNumber > 1000) ||
                (thirdNumber < 10 || thirdNumber > 1000)) {

            return false;
        }
        else {
            int lastDigit1 = firstNumber%10;
            int lastDigit2 = secondNumber%10;
            int lastDigit3 = thirdNumber%10;

            if ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3)) {
                return true;
            }

            else {
                return false;
            }
        }

    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        else {
            return true;
        }
    }
}
