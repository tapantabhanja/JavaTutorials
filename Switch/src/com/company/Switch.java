package com.company;

import java.util.Locale;

public class Switch {

    public static void main(String[] args) {
	// write your code here
        /**
        int value = 3;

        if (value == 1) {
            System.out.println("Value was 1");
        }
        else if (value == 2) {
            System.out.println("Value was 2");
        }
        else {
            System.out.println("Was not 1 or 2");
        }
        **/

        int switchValue = 1;

        switch(switchValue) {  //Notes: "break;" is extremely important, otherwise the execution flow continues and all the cases get executed.
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Was actually: "+switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4  or 5");
                break;
        }

        // Challenge:
        // Create a new switch statement using char instead of int.
        // create a new char variable.
        // create a switch statement testing for A, B, C, D, E.
        // display a message if any of these are found and then break.
        // Add a default which displays a message saying not found.

        char switchCharValue = 'B';

        switch(switchCharValue) {

            case 'A':
                System.out.println("Char Value was A.");
                break;

            case 'B':
                System.out.println("Char Value was B.");
                break;

            case 'C':
                System.out.println("Char Value was C.");
                break;

            case 'D':
                System.out.println("Char Value was D.");
                break;

            case 'E':
                System.out.println("Char Value was E.");
                break;

            default:
                System.out.println("Not Found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {  // Is a solution in case the user enters any character in a different case that the one in the combination.
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not Sure");
        }
    }
}
