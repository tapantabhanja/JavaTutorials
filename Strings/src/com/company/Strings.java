package com.company;

public class Strings {

    public static void main(String[] args) {
	// write your code here

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("My String contains: "+myString);
        myString = myString + ", this is more to it.";
        System.out.println("My String now contains: "+myString);
        myString = myString + "\u00A9 2019";
        System.out.println("My String now contains: "+myString);

        String numberString = "250.55";
        numberString = numberString+"49.55";
        System.out.println("My Number String: "+numberString); // Shows string treats numbers in it also as string.

        // Any numerical value (int or double) added with '+' to a string will result in a String.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to:" + lastString);

        // Similarly for double.
        double myDoubleNumber = 120.47d;
        lastString = lastString+myDoubleNumber;
        System.out.println("LastString is equal to: "+lastString);

        
    }
}
