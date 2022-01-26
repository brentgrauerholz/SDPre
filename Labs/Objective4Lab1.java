import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();
    System.out.println("My name is John Doe.");
    System.out.println("My favorite animal is the Lemur.");
    System.out.println("My favorite food is Tacos");
    System.out.println("My favorite song is Twinkle Twinkle Little Star");
  }
}
