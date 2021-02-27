public class FlourPacker {

    public static void main(String[] args) {
        System.out.println("Package Test: " + canPack(1,0,4));
        System.out.println("Package Test: " + canPack(1,0,5));
        System.out.println("Package Test: " + canPack(0,5,4));
        System.out.println("Package Test: " + canPack(2,2,11));
        System.out.println("Package Test: " + canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        else {
            int numberBigBagsNeeded = goal/5;
            int numberSmallBagsNeeded = goal%5;

            if (smallCount < numberSmallBagsNeeded) {
                return false;
            }

            else {

                if (bigCount < numberBigBagsNeeded) {

                    return ((bigCount * 5) + smallCount) >= goal;
                }

                else {
                    return true;
                }

            }

        }
    }
}


