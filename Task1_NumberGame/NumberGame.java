import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int roundsWon = 0;
        char playAgain;

        System.out.println("===================================");
        System.out.println("      WELCOME TO NUMBER GAME");
        System.out.println("===================================");

        do {

            int number = random.nextInt(100) + 1;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {

                System.out.print("Attempt " + attempt + ": ");
                int guess = sc.nextInt();

                if (guess == number) {

                    System.out.println("Correct! You guessed the number.");

                    guessed = true;
                    roundsWon++;

                    totalScore += (maxAttempts - attempt + 1) * 10;
                    break;

                } else if (guess < number) {

                    System.out.println("Too Low!");

                } else {

                    System.out.println("Too High!");
                }
            }

            if (!guessed) {

                System.out.println("You Lost!");
                System.out.println("Correct Number was : " + number);
            }

            System.out.println("\nCurrent Score : " + totalScore);

            System.out.print("\nPlay Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n========== GAME OVER ==========");
        System.out.println("Rounds Won : " + roundsWon);
        System.out.println("Final Score : " + totalScore);
        System.out.println("Thank You for Playing!");

        sc.close();
    }
}
