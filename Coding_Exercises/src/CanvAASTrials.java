import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CanvAASTrials {

    public static void main(String[] args) {
        Map<String, String> output = parseUserInput("{Input1=Test1, Input2=Test2, Input3=Test3, Input4=Test4}");

        // Set<String> keys = output.keySet();
        System.out.println(output.keySet());

        Set<String> inputparameter = storeInputVariables("{Input1=Test1, Input2=Test2, Input3=Test3, Input4=Test4}");

        for (String param : inputparameter)
        {
            System.out.println("Printing Parameters: "+param);
        }


    }

    public static Map<String, String> parseUserInput(String userInput) {

        Map<String, String> mappedUserInput = new LinkedHashMap<String, String>();

        // Deleting the first and last character of the String. the curly braces {}.
        userInput = userInput.substring(1, userInput.length()-1);

        // Removing all whitespaces from the user input.
        userInput = userInput.replaceAll("\\s+","");

        // Splitting the String with respect to "," and thereafter "=".
        String[] resultArr = userInput.split(",|=", -1);


        for (int i=0; i< resultArr.length-1; i=i+2) {
            mappedUserInput.put(resultArr[i], resultArr[i+1]);
        }


        System.out.println("------------------------------------------");
        return mappedUserInput;
    }

    public static Set<String> storeInputVariables(String userInput) {
        
        Set<String> inputParameters = new HashSet<String>();
        inputParameters.add("Input1");
        inputParameters.add("Input2");
        inputParameters.add("Input3");
        
        return inputParameters;
    }

}
