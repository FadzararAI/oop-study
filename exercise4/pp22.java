import java.util.Scanner;

public class pp22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter third number: ");
    int num3 = input.nextInt();

    int avg = (num1 + num2 + num3)/3;
    System.out.println("Average: " + avg);
  }
}
