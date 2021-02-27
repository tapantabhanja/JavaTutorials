public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("The result: "+getEvenDigitSum(123456789));
        System.out.println("The result: "+getEvenDigitSum(252));
        System.out.println("The result: "+getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        else {
            int digitSum = 0;

            do {
                if ((number%10)%2 == 0) {
                    digitSum += number%10;
                }
                number = number/10;
            } while (number/10 > 0);

            if ((number%10)%2 == 0) {
                digitSum += number;
            }

            return digitSum;
        }
    }
}
