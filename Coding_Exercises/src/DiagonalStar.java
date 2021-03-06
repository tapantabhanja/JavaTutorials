/**
 * Updating this doc to make a commit with multiline commit message.
 * Adding more lines in the doc.
 * Adding lines to check if the git config works to update the commits with proper author name.
 */
public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {

        String star = "*";

        if (number < 5) {
            System.out.println("Invalid Value");
        }

        else {
            for (int row=0; row<number; row++) {
                for (int col=0; col<number; col++) {
                    if ((row==0) || (row==(number-1))) {
                        System.out.print("*");
                    }
                    else if (col==0 || col==number-1) {
                        System.out.print("*");
                    }
                    else if (row==col) {
                        System.out.print("*");
                    }

                    else if (row+col==number-1) {
                        System.out.print("*");
                    }

                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
