import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        final int maxAttempts = 7; 
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        
        while (attempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
            } else if (guess < targetNumber) {
                System.out.println("Try again. The number I'm thinking of is higher.");
            } else {
                System.out.println("Try again. The number I'm thinking of is lower.");
            }
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The number I was thinking of was: " + targetNumber);
        }
        
        scanner.close();
    }
}
