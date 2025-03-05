
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kevinchen
 */
public class WordGuessingGame {

    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;
    private Random rand;
    private final String[] wordList;

    public WordGuessingGame(String[] wordList, int maxAttempts) {
        this.wordList = wordList;
        this.attempts = maxAttempts;
    }

    // Add other methods and logic here
    public String play() {
        setUpGame();
        Scanner scanner = new Scanner(System.in);
        while (attempts > 0) {
            displayState();
            System.out.println("You have " + attempts + " attempts left.");
            System.out.print("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (processGuess(guess)) {
                System.out.println("Correct guess!");
                if (new String(guessedLetters).equals(wordToGuess)) {
                    System.out.println("Congratulations! You have guessed the word: " + wordToGuess);
                    return "Win";
                }
            } else {
                System.out.println("That guess was incorrect.");
                attempts--;
            }
        }
        return "Loss";
    }

    private boolean processGuess(char letter) {
        boolean letterFound = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedLetters[i] = letter;
                letterFound = true;
            }

        }
        return letterFound;
    }

    private void displayState() {
        System.out.println("Guessed Letters: " + new String(guessedLetters));
    }

    private void setUpGame() {
        // Set up the game
        this.rand = new Random();
        this.wordToGuess = wordList[(rand.nextInt(wordList.length))];
        this.guessedLetters = new char[this.wordToGuess.length()];
        for (int i = 0; i < this.guessedLetters.length; i++) {
            this.guessedLetters[i] = '_';
        }
    }
}
