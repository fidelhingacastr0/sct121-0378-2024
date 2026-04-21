import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Generate random number between 1 and 50
        int target = (int)(Math.random() * 50) + 1;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I have chosen a number between 1 and 50. Guess it!");

        int guess;
        int attempts = 0;

        // Step 2: While loop until correct guess
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! The number was " + target);
                System.out.println("You took " + attempts + " attempts.");
            }
        } while (guess != target);
    }
}
