This code is a Java program for a simple number guessing game between the user and the computer. 
The game has a set of rules, and the user has to guess a randomly chosen number within a specified range

package task1;

import java.util.Random;
import java.util.Scanner;
public class Numbergame {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc class for reading user input.
        Random random = new Random(); //ramdom class for generating random numbers.
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int score = 0;// Keeps track of the user's score.

        System.out.println("Welcome to the Number Guessing Game!");
    	System.out.println("Game Rules");
    	System.out.println("-----------------------------------------------------------------------");
    	System.out.println("Rule No.1 :"+"Guess Number Under 100");
    	System.out.println("Rule No.2 :"+"there are 5 match series between you and computer");
    	System.out.println("Rule No.3 :"+"If You win 3 games you will win the series");
    	System.out.println("if the computer win 3 games out of 10 then computer win");
    	System.out.println("number must be equal to 100 either below to 100 ");
    	System.out.println("----------------------------------------------------------------------------");

        while (true) { 
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + targetNumber + ".");
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your total score is: " + score);
                break;
            }
        }

        sc.close();
    }
}


