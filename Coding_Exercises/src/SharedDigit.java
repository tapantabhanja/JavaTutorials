import java.sql.SQLOutput;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        else {
            int retrievedDigit1 = firstNumber % 10;
            int retrievedDigit2 = firstNumber / 10;

            if ((retrievedDigit1 == secondNumber/10) || (retrievedDigit1 == secondNumber%10)) {
                return true;
            }
            return (retrievedDigit2 == secondNumber / 10) || (retrievedDigit2 == secondNumber % 10);
        }
    }
}
