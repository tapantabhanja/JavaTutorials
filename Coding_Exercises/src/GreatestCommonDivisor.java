import java.sql.SQLOutput;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        // System.out.println("GCD Test: "+getGreatestCommonDivisor(25, 15));
        // System.out.println("GCD Test: "+getGreatestCommonDivisor(12, 30));
        // System.out.println("GCD Test: "+getGreatestCommonDivisor(9, 18));
        // System.out.println("GCD Test: "+getGreatestCommonDivisor(81, 153));
        System.out.println("GCD Test: "+getGreatestCommonDivisor(1010, 10));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        else {
            int numberUsed = Math.min(first, second);
            int numberNotUsed = Math.max(first, second);


            int greatestCommonDivisor = 0;

            int divisor = 1;
            while (((double) numberUsed/ (double) divisor) >= 1.0) {

                if (numberUsed%divisor == 0 && numberNotUsed%divisor == 0) {
                    greatestCommonDivisor = divisor;
                }

                divisor += 1;

            }

            return greatestCommonDivisor;
        }
    }
}
