package com.company;

public class Methods {

    public static void main(String[] args) {
	// write your code here

        int finalscore1 = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: "+finalscore1);

        int finalscore2 = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: "+finalscore2);

        // ---------------------------------------------------------------------------------------

        int score_equivalent1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Anke Gäbisch", score_equivalent1);

        int score_equivalent2 = calculateHighScorePosition(900);
        displayHighScorePosition("Tapanta Bhanja", score_equivalent2);

        int score_equivalent3 = calculateHighScorePosition(400);
        displayHighScorePosition("Govind Sharma", score_equivalent3);

        int score_equivalent4 = calculateHighScorePosition(50);
        displayHighScorePosition("Sampreeth Madhur", score_equivalent4);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        int finalScore = -1;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            // System.out.println("Your final score was: " + finalScore);

            return finalScore;
        }
        else {
            return finalScore;
        }

    }

    // Create a method called displayHighScorePosition
    // it should take a player's name as a parameter, and a 2nd parameter as a position in the high
    // score table.
    // You should display the players name along with a message like "managed to get into position" and
    // the position they got and a further message "on the high score table".

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    // Create a 2nd method called calculateHighScorePosition it should be sent one argument only,
    // it should be sent one argument only, the player score it should return an int
    // the return data should be
    // 1 if the score is >= 1000
    // 2 if the score is >= 500 and < 1000
    // 3 if the score is >= 100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50.

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        // The expression "score < 1000" is redundant, since the first condition already check if the score is >= 1000,
        // which means if we are getting to the current line, it means score is definitely less than 1000.
        // else if (score >= 500 && score < 1000) {
        //    return 2;
        //}
        else if (score >= 500) {
            return 2;
        }
        // The expression "score < 500" is redundant, since the first condition already check if the score is >= 500,
        // which means if we are getting to the current line, it means score is definitely less than <500.
        // else if (score >= 100 && score < 500) {
        //    return 3;
        //}
        else if (score >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
