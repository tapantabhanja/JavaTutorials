package com.company;

public class Operators {

    public static void main(String[] args) {
	// write your code here

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("Previous result = "+previousResult);

        result = result - 1;
        System.out.println("3 - 1 = "+result);
        System.out.println("Previous result = "+previousResult);

        result = result * 10; // 2*10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20/5
        System.out.println("20 / 5 = "+result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2-1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10-2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore <= 80) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than the second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!");
        }
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen!");
        }

        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 31;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("Client mature.");
        }

        // Challenge for Operator sections.
        // 1. Create a double variable with a value of 20.00.

        double operatorVar1 = 20.00d;

        // 2. Create a second variable of type double with the value 80.00.

        double operatorVar2 = 80.00d;

        // 3. Add both numbers together and multiply by 100.00.

        double multiVar3 = (operatorVar1 + operatorVar2) * 100.0d;
        System.out.println("My Values Total = " + multiVar3);

        // 4. Use the remainder operator to figure out what the remainder from the result of the
        // operation in step 3 and 40.00. We used the modulus or remainder operator on ints in the
        // course, but we can also use it on a double.

        double remVar4 = multiVar3 % 40.00d;
        System.out.println("The remainder = " + remVar4);

        // 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or
        // false if its not zero.

        boolean boolVar5 = (remVar4 == 0) ? true : false;

        // 6. Output the boolean variable.

        System.out.println("The output of the boolean variable: " + boolVar5);

        // 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5
        // is not true. Don't be surprised if you see output for this step, where you might expect it not to
        // show. I'll explain it in my solution.

        if (!boolVar5) {
            System.out.println("Got some Remainder.");
        }

    }
}
