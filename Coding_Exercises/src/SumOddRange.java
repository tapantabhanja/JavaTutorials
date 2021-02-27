public class SumOddRange {
    public static void main(String[] args) {
        System.out.println("The sum is: "+sumOdd(1, 100));
        System.out.println("The sum is: "+sumOdd(-1, 100));
        System.out.println("The sum is: "+sumOdd(100, 100));
        System.out.println("The sum is: "+sumOdd(13, 13));
        System.out.println("The sum is: "+sumOdd(100, -100));
        System.out.println("The sum is: "+sumOdd(100, 1000));
    }
    public static boolean isOdd(int number) {

        if (number<0) {
            return false;
        }
        else {
            if (number%2==0) {
                return false;
            }
            else {
                return true;
            }
        }
    }
    public static int sumOdd(int start, int end) {

        if ((start<0 || end <0) || end<start) {
            return -1;
        }
        else {
            int sum = 0;

            for (int i=start; i<=end; i++) {

                boolean odd = isOdd(i);

                if (odd) {

                    sum+=i;
                }
                else {
                    ;
                }
            }
            return sum;
        }
    }
}
