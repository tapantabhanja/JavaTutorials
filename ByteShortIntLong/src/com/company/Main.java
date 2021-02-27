package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue+1));  // An example of overflow.
        System.out.println("Busted MIN Value = " + (myMinIntValue-1));  // An example of underflow.

        int myMaxIntTest = 2_147_483_647; // An alternative way of writing big numbers.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // ----------------------------------------------------------------------

        int myNewIntValue = (myMinIntValue/2);
        System.out.println("My New Int Value = "+myNewIntValue);

        byte myTestByte = 127;
        // byte myNewByteValue = (myMinByteValue / 2);  // Is an example which shows that any whole number is by default considered an Int in Java.
        byte myNewByteValue = (byte) (myMinByteValue / 2); // An example of casting, used to solve the problem in line 45.

        short myNewShortValue = (short) (myMinShortValue / 2); // An example of casting in case of short.

        // CHALLENGE: Primitive Types Challenge.
        byte challengeByteValue = 10;
        short challengeShortValue = 30;
        int challengeIntValue = 2_000_000_000;

        // If the (long) here in line 56 is not mentioned. Java implicitly casts the values to long.
        long challengeResultValue = 50_000 + (long) 10*(challengeByteValue + challengeShortValue + challengeIntValue);
        System.out.println(challengeResultValue);

        // Doing the same with datatype short.

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        short shortTotal = (short) (1000 + 10*(byteValue + shortValue + intValue));  // Even though the resulting value is well
        // within the range of short. Since the result of an expression is always considered an int in java.
        // We have to use casting here.

        System.out.println(shortTotal);

    }
}
