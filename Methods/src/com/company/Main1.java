package com.company;

// Contains the code for method overloading. It is basically using the same method name but with a different number of parameters.
// Like: ----.isTeen(int a);
//       ----.isTeen(int a, int b);

public class Main1 {

    public static void main(String[] args) {
        int newScore = calculateScore("Tapanta", 500);

        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points.");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
