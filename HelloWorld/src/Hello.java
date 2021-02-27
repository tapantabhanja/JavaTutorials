public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tapanta");

        int myFirstNumber = (5 + 10) + (2 * 10); // It is a declaration statement, the value '5' is an expression and also has the operators.
        int mySecondNumber = 12;
        // int myThirdNumber = 6;
        int myThirdNumber = myFirstNumber*2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000-myTotal;

        System.out.println("The Number to be printed is: "+myFirstNumber);
        System.out.println("The sum of the numbers: "+myTotal);
        System.out.println("The value of myLastOne: "+myLastOne);
    }
}
