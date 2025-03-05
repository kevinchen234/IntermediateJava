
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kevinchen
 */
public class App {

    public static void main(String[] args) {
        String[] words = {"java", "programming", "class", "method", "computer"};
        WordGuessingGame game = new WordGuessingGame(words, 10);
        int wins = 0;
        int losses = 0;
        boolean playAgain = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome to the Word Guessing Game!");
            String result = game.play();
            if (result.equals("Win")) {
                wins++;
            } else {
                losses++;
            }
            System.out.println("Wins: " + wins + " Losses: " + losses);
            System.out.print("Would you like to play again? (y/n): ");
            char response = scanner.nextLine().toLowerCase().charAt(0);
            playAgain = response == 'y';
        } while (playAgain);
    }
}
