// Write a method with the name sumDigits that has one int parameter
// called number.
// If parameter is >=10 then the method should process the number and return
// sum of all digits, otherwise return -1 to indicate an invalid value.
// The numbers from 0-9 have 1 digit so we don't want to process them, also
// we don't want to process negative numbers, so also return -1 for negative
// numbers.
// For example, calling the method sumDigits(125) should return 8 since 1+ 2 + 5 = 8.
// Calling the method sumDigits(1) should return -1 as per requirements
// described above.
// Add some code to the main method to test out the sumDigits method to determine that
// it is working correctly for valid and invalid values passed as arguments.

public class DigitSum {
    public static void main(String[] args) {

        System.out.println("Sum of Digits: "+sumDigits(125));
        System.out.println("Sum of Digits: "+sumDigits1(125));
        System.out.println("---------------------------------------");
        System.out.println("Sum of Digits: "+sumDigits(4));
        System.out.println("Sum of Digits: "+sumDigits1(4));
        System.out.println("---------------------------------------");
        System.out.println("Sum of Digits: "+sumDigits(32123));
        System.out.println("Sum of Digits: "+sumDigits1(32123));
        System.out.println("---------------------------------------");


    }

    public static int sumDigits(int number) {

        // Approach 1.

        if (number < 10) {
            return -1;
        }
        else {

            int sum = 0;

            while (number%10 != number) {

                int rem = number%10;
                number = number/10;
                sum += rem;
            }

            return sum+number;

        }

    }

    public static int sumDigits1(int number) {

        if (number <10) {
            return -1;
        }

        int sum = 0;

        while (number >0) {
            // Extract the least significant digit.
            int digit = number%10;
            sum += digit;

            // Drop the least-significant digit.
            number /= 10;  // same as number = number/10;
        }

        return sum;

    }
}
