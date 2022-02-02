import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    int i = 0;
    if (userNum > i) {
      System.out.println("The number is > 0");
    }
    if (userNum < i) {
      System.out.println("The number is < 0");
    }
    else if (userNum == i); {
      System.out.println("The number is = 0");
    }

    scanner.close();
  }
}
