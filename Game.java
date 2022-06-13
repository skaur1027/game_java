import java.util.Scanner;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name:");
    String name = input.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100.");
  }
}
