package com.company;

public class Sum3And5 {
    public static void main(String[] args) {

        int sumOfNumbers = 0;
        int countNumber = 0;

        for (int i=1; i<=1000; i++) {

            if ((i%3 == 0) && (i%5 == 0)) {

                System.out.println("The number that met the condition: "+i);
                sumOfNumbers = sumOfNumbers+i;

                countNumber+=1;

                if (countNumber==5) {
                    System.out.println("Breaking out of loop.");
                    break;
                }
            }

        }
        System.out.println("The sum is = "+sumOfNumbers);
    }
}
