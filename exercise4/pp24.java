import java.util.Scanner;

public class pp24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter temperature in F: ");
    double num1 = input.nextDouble();

    double f2c = (num1 - 32)/1.8;
    System.out.printf("In celsius: %.1f\n", f2c);
  }
}
