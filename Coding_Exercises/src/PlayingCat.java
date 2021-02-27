public class PlayingCat {

    /**
     * Checks if the weather and temperature conditions are ideal for the cat to play.
     * @param summer Takes in boolean value if it is summer or not.
     * @param temperature Takes in the current temperature.
     * @return Returns a boolean value if the cat is playing.
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
            else {
                return false;
            }
        }
        else
        {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
