package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here.

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        boolean game2over = true;

        if (score <5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }
        else if (score < 1000) {
            System.out.println("Your Score is less than 1000");
        }
        else {
            System.out.println("Got Here");
        }

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

        // Print out a second score on the screen with the following.
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well.

        if (game2over) {

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + finalscore);

        }

        System.out.println("The initial score: " + score);
        System.out.println("The initial level completed: " + levelCompleted);
        System.out.println("The initial bonus: " + bonus);

        // the concept of code blocks leads to the direction of methods. Methods help in ensuring that
        // code written is not redundant and can be called when needed, as many times as one wants it to.

    }
}
