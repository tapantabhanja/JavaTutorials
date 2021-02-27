public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        // Validation
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        // 1 day = 1440 minutes
        // 1 year = 525,600 minutes.

        else
        {
            // Calculating the number of years.
            long numOfYears = minutes / 525600;
            long remMinutesForDays = minutes % 525600;

            // Calculating the number of days.
            long numOfDays = remMinutesForDays / 1440;
            long remMinutes = remMinutesForDays % 1440;

            System.out.println(minutes+" min = "+numOfYears+" y and "+numOfDays+" d");

        }
    }
}
