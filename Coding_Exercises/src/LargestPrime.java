public class LargestPrime {

    public static void main(String[] args) {
        System.out.println("Largest Prime Factor: "+ getLargestPrime(21));
        System.out.println("Largest Prime Factor: "+ getLargestPrime(217));
        System.out.println("Largest Prime Factor: "+ getLargestPrime(0));
        System.out.println("Largest Prime Factor: "+ getLargestPrime(45));
        System.out.println("Largest Prime Factor: "+ getLargestPrime(-1));
        System.out.println("Largest Prime Factor: "+ getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {

        int largestPrimeFactor = 0;

        if (number < 2) {
            return -1;
        }

        else {
            int divisor = 2;
            while(divisor <= number) {

                if (number%divisor==0) {
                    int subDivisor = 2; int counter = 0;
                    while (subDivisor <= divisor) {
                        if (divisor%subDivisor == 0) {
                            counter += 1;
                        }
                        subDivisor+=1;
                    }
                    if (counter == 1) {
                        largestPrimeFactor = divisor;
                    }
                }

                divisor+=1;
            }
         return largestPrimeFactor;
        }
    }
}
