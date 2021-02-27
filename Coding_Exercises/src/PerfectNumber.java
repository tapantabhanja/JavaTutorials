public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("Check perfect number: "+isPerfectNumber(6));
        System.out.println("Check perfect number: "+isPerfectNumber(28));
        System.out.println("Check perfect number: "+isPerfectNumber(5));
        System.out.println("Check perfect number: "+isPerfectNumber(-1));
        System.out.println("Check perfect number: "+isPerfectNumber(33550336));

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        else {
            int divisor = 1;
            int addedNumber = 0;

            while (((double) number / (double) divisor) > 1.0) {

                if (number%divisor == 0) {
                    addedNumber += divisor;
                }
                divisor += 1;
            }

            //return addedNumber == number;

            return addedNumber == number;
        }
    }
}
