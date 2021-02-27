public class NumberToWords {

    public static void main(String[] args) {
        System.out.println("Test: "+reverse(5));
        System.out.println("------------------------------------------");
        System.out.println("Digit Count: "+getDigitCount(1212));
        System.out.println("------------------------------------------");
        numberToWords(1212);
        System.out.println("------------------------------------------");

    }

    public static void numberToWords(int number) {

        int numberToWork = reverse(number);

        int countDigitOriginal = getDigitCount(number);
        int countDigitReverse = getDigitCount(numberToWork);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        else {

            while ((numberToWork)/10!=0) {
                int digitToPrint = numberToWork%10;

                switch (digitToPrint) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                numberToWork /= 10;
            }
            switch (numberToWork) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        if (countDigitOriginal != countDigitReverse) {
            int digitDifference = countDigitOriginal-countDigitReverse;

            while (digitDifference!=0) {
                System.out.println("Zero");
                digitDifference--;
            }

        }

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        else {
            int digitCount = 0;

            while ((number/10) != 0) {
                digitCount+=1;
                number /= 10;
            }

            return digitCount+1;
        }
    }

    public static int reverse(int number) {


        if (number < 10 && number > -10) {
            return number;
        }
        else {

            int reversedNumber = 0;

            do {
                reversedNumber = reversedNumber*10 + (number%10);
                number /= 10;
            } while((number/10)!=0);

            return reversedNumber*10 + number;
        }

    }
}
