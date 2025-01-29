package MyselfBuilds;

import java.util.Random;
import java.util.Scanner;

public class RPCgpt {
    public static void main(String[] args) {
        System.out.println("------Welcome to Rock-Paper-Scissors------");
        Scanner sc = new Scanner(System.in);

        // Initialize scores
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Choose difficulty level: 1. Easy 2. Medium 3. Hard");
        int difficulty = sc.nextInt();

        boolean choice = true;
        while (choice) {
            System.out.println("Enter '0' for rock, '1' for paper, and '2' for scissors.");
            int ch = sc.nextInt();
            Random rand = new Random();
            int rn = rand.nextInt(3);

            // For hard difficulty, the computer tries to guess the player's next move
            if (difficulty == 3) {
                // If player tends to repeat their choices, the computer might use this pattern
                rn = (ch + 1) % 3; // A basic counter-move: rock -> paper, paper -> scissors, scissors -> rock
            }

            if (ch > 2) {
                System.out.println("Wrong choice!!___Try again...");
            } else {
                if (ch == 0 && rn == 2 || ch == 1 && rn == 0 || ch == 2 && rn == 1) {
                    System.out.println("You win...");
                    userScore++;
                } else if (ch == rn) {
                    System.out.println("Draw! Both chose the same option...");
                } else {
                    System.out.println("Computer wins! You lose!!");
                    computerScore++;
                }
                System.out.println("Computer choice is: " + (rn == 0 ? "rock" : rn == 1 ? "paper" : "scissors"));
                System.out.println("Score -> You: " + userScore + " | Computer: " + computerScore);
            }
            sc.nextLine(); // consume the newline
            System.out.println("To continue playing, press any key. To exit, type 'exit'.");
            String con = sc.nextLine();
            if (con.equalsIgnoreCase("exit")) {
                choice = false;
                System.out.println("\n--------------Thank you for playing--------------");
                System.out.println("Final Score -> You: " + userScore + " | Computer: " + computerScore);
            }
        }
        sc.close();
    }
}
