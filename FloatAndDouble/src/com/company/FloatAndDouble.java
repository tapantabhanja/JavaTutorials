package com.company;

public class FloatAndDouble {

    public static void main(String[] args) {
	// write your code here

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = (float) 5 / 3f; // This is an example of one could cast.
        double myDoubleValue = 5d / 3d; // This a 2nd variant of the casting.

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = "+ myDoubleValue);


        // Challenge in "Floating Point Precision and a Challenge."
        double myPound = 200d;
        double myKilos = myPound*0.45359237d;

        System.out.println("My Weight in Pounds = "+myPound);
        System.out.println("My Weight in Kilograms = "+myKilos);

        // Just some test outputs.
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}