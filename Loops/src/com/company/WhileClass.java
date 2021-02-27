package com.company;

public class WhileClass {

    public static void main(String[] args) {
        int count = 0;

        while (count!=5) {
            System.out.println("Count value is: "+count);
            count++;
        }

        System.out.println("**********************");
        // Another fashion of writing the while loop.
        count = 1;
        while(true) {
            if(count == 6) {
                break;
            }

            System.out.println("Count value is: "+count);
            count++;
        }

        System.out.println("**********************");
        // An Example of do-while loop
        count = 1;
        do {
            System.out.println("Count value is: "+count);
            count++;
        } while(count!=6);

        // But since do-while guarantees the execution of the do section atleast once. The following code block would be
        // a problem.
        count = 6;
        do {
            System.out.println("Count value is: " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while(count!=6);

        // This happens since the first time the program checks for the exit condition, the count is 7, which is satisfies
        // the condition to keep the loop running. That is (count != 6).

        //------------------------------------------------------------------------
        int number = 4;
        int finishNumber = 20;
        int numOfEven = 0;

        while (number <= finishNumber) {

            number++;

            if(!isEvenNumber(number)) {
                continue;
            }
            else {
                System.out.println("Even Number: "+number);
                numOfEven++;
                if (numOfEven==5) {
                    break;
                }
            }


        }
        System.out.println("Total Number of Even Numbers found: " + numOfEven);

        // Challenge 2:
        // Modify the while code above.
        // Make it also record the total number of even numbers it has found.
        // and break once 5 are found.
        // and at the end, display the total number of even numbers found.

    }

    // Challenge 1:
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false.

    public static boolean isEvenNumber(int number) {
        if((number%2)==0) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
