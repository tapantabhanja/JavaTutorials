public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println("-------------------------");
        printFactors(32);
        System.out.println("-------------------------");
        printFactors(10);
        System.out.println("-------------------------");
        printFactors(-1);
        System.out.println("-------------------------");
    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        else {

            int divisor = 1;
            while(((double) number/ (double) divisor) >= 1) {

                if (number%divisor == 0) {
                    System.out.println(divisor);
                }

                divisor += 1;
            }
        }
    }
}
