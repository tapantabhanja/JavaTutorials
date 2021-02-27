public class DecimalComparator {
    //public static long areEqualByThreeDecimalPlaces(double num1) {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        // Using String.valueOf() - this function call is used to convert different types of values into string.
        // Like:
        // int - string
        // long - string
        // boolean - string
        // character - string
        // float - string
        // double - string
        // object - string
        // char array - string

        String firstDoubleAsString = String.valueOf(num1); // Converting the first double.
        String secondDoubleAsString = String.valueOf(num2); // Converting the second double.

        // Using ".indexOf()" - this method returns the position of the first occurrence of specified character in a string.
        int indexOfDecimal1 = firstDoubleAsString.indexOf(".");
        int indexOfDecimal2 = secondDoubleAsString.indexOf(".");

        System.out.println("Double Number1: " + num1);
        System.out.println("Double Number2: " + num2);

        // Using "substring(int beginIndex, int endIndex)" of the String class. This method returns a new string that is
        // a substring of the given string. The substring begins at the specified beginIndex and extends to the character
        // at index (endIndex - 1). Thus, the length of the substring is (endIndex-beginIndex).
        String tempIntValue1 = firstDoubleAsString.substring(0, indexOfDecimal1);
        String tempIntValue2 = secondDoubleAsString.substring(0, indexOfDecimal2);

        int integerValue1 = Integer.parseInt(tempIntValue1);  // Converting the String type of "tempIntValue1" into Integer.
        int integerValue2 = Integer.parseInt(tempIntValue2);  //Converting the String type of "tempIntValue2" into Integer.


        String tempDecValue1 = firstDoubleAsString.substring(indexOfDecimal1+1);
        int numOfDecimalPlaces1 = tempDecValue1.length();

        String tempDecValue2 = secondDoubleAsString.substring(indexOfDecimal2+1);
        int numOfDecimalPlaces2 = tempDecValue2.length();

        // TODO: Use a if statement here to check if the number of digits after the decimal places are more than 3.
        // TODO: Then use the corresponding way to calculate the "tempDecValueX".

        int decimalValue1 = 0;
        int decimalValue2 = 0;

        if (numOfDecimalPlaces1 >= 3) {
            decimalValue1 = Integer.parseInt(tempDecValue1.substring(0, 3)); // Converting the String type of "tempDecValue1" into Integer.
        }
        else
        {
            decimalValue1 = Integer.parseInt(tempDecValue1); // Converting the String type of "tempDecValue1" into Integer.
        }

        if (numOfDecimalPlaces2 >= 3) {
            decimalValue2 = Integer.parseInt(tempDecValue2.substring(0, 3)); // Converting the String type of "tempDecValue2" into Integer.
        }
        else
        {
            decimalValue2 = Integer.parseInt(tempDecValue2); // Converting the String type of "tempDecValue2" into Integer.
        }

        System.out.println("Integer Part1: " + integerValue1);
        System.out.println("Decimal Part1: " + decimalValue1);

        System.out.println("Integer Part2: " + integerValue2);
        System.out.println("Decimal Part2:" + decimalValue2);

        if (integerValue1 == integerValue2 && decimalValue1 == decimalValue2) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {

        boolean result1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175); // The output should be a true
        System.out.println("The result of comparison is: " + result1);
        boolean result2 = areEqualByThreeDecimalPlaces(3.175, 3.176); // The output should be a false
        System.out.println("The result of comparison is: " + result2);
        boolean result3 = areEqualByThreeDecimalPlaces(3.0, 3.0); // The output should be a true
        System.out.println("The result of comparison is: " + result3);
        boolean result4 = areEqualByThreeDecimalPlaces(-3.123, 3.123); // The output should be a false
        System.out.println("The result of comparison is: " + result4);
    }
}
