package com.company;

// This module shows an example of method overloading in Java.

public class OverloadedUnitConversion {
    public static void main(String[] args) {
        double calculatedCentimeter = calcFeetAndInchesToCentimeters(157);

        System.out.println("The calculated centimeter value is: " + calculatedCentimeter);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        else {
            // Converting feet into inches
            double convertedInches = feet*12;

            // Adding the convertedInches and the entered inches.
            double totalInches = convertedInches+inches;

            // Converting Inches to Centimeters and returning it.
            return 2.54*totalInches;

        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        else
        {
            int feetInInches = (int) inches / 12;
            double remainingInches = inches % 12;

            // System.out.println("Printing the calculated Feet: "+feetInInches);
            // System.out.println("Printing the calculated Inches: "+remainingInches);

            return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);

        }
    }
}
