public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(65,9));

    }
    public static String getDurationString(int minutes, int seconds) {
        // Validation Step
        if (minutes<0 || seconds<0 || seconds>59) {
            return "Invalid Value";
        }
        else
        {
            // Calculating the Hours.
            int calcHours = minutes / 60;
            int calcMinutes = (minutes % 60);

            // Declaring displaying variables.
            String displayHours;
            String displayMinutes;
            String displaySeconds;

            // Display formatting for hours.
            if (calcHours < 10) {
                displayHours = String.format("0%s", calcHours);
            }
            else {
                displayHours = String.format("%s", calcHours);
            }

            // Display formatting for minutes.
            if (calcMinutes < 10) {
                displayMinutes = String.format("0%s", calcMinutes);
            }
            else {
                displayMinutes = String.format("%s", calcMinutes);
            }

            // Display formatting for seconds.
            if (seconds < 10) {
                displaySeconds = String.format("0%s", seconds);
            }
            else {
                displaySeconds = String.format("%s", seconds);
            }

            return displayHours+"h "+displayMinutes+"m "+displaySeconds+"s";
        }
    }

    public static String getDurationString(int seconds) {

        // Validating the Input.
        if (seconds < 0) {
            return "Invalid Value";
        }
        else
        {
            int minutesInSeconds = seconds/60;
            int remSeconds = seconds%60;

            return getDurationString(minutesInSeconds, remSeconds);
        }
    }
}
