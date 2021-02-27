public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println("First & Last Digit Sum Check: " + sumFirstAndLastDigit(252));
        System.out.println("First & Last Digit Sum Check: " + sumFirstAndLastDigit(257));
        System.out.println("First & Last Digit Sum Check: " + sumFirstAndLastDigit(0));
        System.out.println("First & Last Digit Sum Check: " + sumFirstAndLastDigit(5));
        System.out.println("First & Last Digit Sum Check: " + sumFirstAndLastDigit(-10));

        String className = "SubModel3Operations";
        className = className.replaceFirst("Operations","");

        System.out.println("New Class Name: "+className);
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        // else if (number < 10) {
        //    return number;
        // }
        else {

            int lastDigit = number % 10;
            int firstDigit = 0;

            do {

                firstDigit = number;

                number = number / 10;

            } while(number>0);

            return lastDigit + firstDigit;

        }

    }
}
