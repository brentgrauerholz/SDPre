import java.util.Scanner;

public class MethodsLab4 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.println("Please give me one number.");
      num1= kb.nextDouble();
    System.out.println("Please give me another number.");
      num2 = kb.nextDouble();


		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
        case 1: answer = findSum(num1, num2);
            System.out.println(num1 + " + " + num2 + " = "+ sum);
            break;
            case 2: answer = findAnswer(num1, num2);
            System.out.println("The average of "+ num1+ " and "+num2+" is:"+ average);
            break;
            case 3: answer = findAnswer(num1, num2);
            System.out.println("The amount of tax to be collected from a purchase of "+num1+" and "+num2+" is "+ tax);
            case 4:
            System.out.println("You've chosen to quit");
            keepGoing = false;
            break;
            default:
            System.out.println("Invalid choice");


		}
    kb.close();
  }

	public static void printMenu() {
    System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

  public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
   }
  public static double findAverage(double j, double b){
    double average = (j+b)/2;
    return average;
   }
  public static double findTax(double s, double m){
    double tax = (s+m)*0.0831;
    return tax;
  }

}
