package com.Day1;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {
	// Initialize the player position
    private static int playerPosition = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Snake and Ladder Game!");

        while (playerPosition < 100) {
            System.out.println("Press enter to roll the dice...");
            scanner.nextLine();

            int diceValue = random.nextInt(6) + 1;
            System.out.println("You rolled a " + diceValue);

            movePlayer(diceValue);

            System.out.println("Your current position is " + playerPosition);

            if (playerPosition == 100) {
                System.out.println("Congratulations! You reached the final square. You won!");
            }
        }

        scanner.close();
    }

    private static void movePlayer(int diceValue) {
        playerPosition += diceValue;

        // Check for snakes
        if (playerPosition == 16 || playerPosition == 47 || playerPosition == 49 ||
            playerPosition == 56 || playerPosition == 62 || playerPosition == 64 ||
            playerPosition == 87 || playerPosition == 93 || playerPosition == 95 ||
            playerPosition == 98) {
            System.out.println("Oops! You landed on a snake. Going down!");
            playerPosition -= 10; // Move 10 steps back
        }

        // Check for ladders
        if (playerPosition == 1 || playerPosition == 4 || playerPosition == 9 ||
            playerPosition == 21 || playerPosition == 28 || playerPosition == 51 ||
            playerPosition == 72 || playerPosition == 80 || playerPosition == 88) {
            System.out.println("Hooray! You found a ladder. Climbing up!");
            playerPosition += 10; // Move 10 steps forward
        }

        // Bounce back if the move exceeds 100
        if (playerPosition > 100) {
            playerPosition = 200 - playerPosition;
        }
    }
}
