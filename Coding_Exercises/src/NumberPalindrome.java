public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println("Test: "+isPalindrome(45355354));
    }

    public static boolean isPalindrome(long number) {

        long reversedNumber = reverseNumber(number);

        if (reversedNumber == number) {
            return true;
        }

        else {
            return false;
        }

    }

    public static long reverseNumber(long number) {

        // long dividend = number;
        long reverse = 0;

        do {
            reverse = reverse*10;

            long lastDigit = number % 10;
            number = number / 10;

            reverse = reverse + lastDigit;

        } while (number!=0);

        return reverse;
    }
}
