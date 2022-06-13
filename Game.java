import java.util.Scanner;
import java.util.Random;


/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = input.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");

    Random rand = new Random();
    int number = rand.nextInt(101);
    int count = 0;

    // ask the user for a guess
    // check the guess against random
    // initiate a counter for every guess, and increment it
    System.out.println("Take your guess.");
    String guess = input.nextLine();
    int guess_num = Integer.parseInt(guess);
    count += 1;
    System.out.println(count + " guesses");
    // System.out.println(number);
  }
}
