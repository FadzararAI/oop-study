import java.util.Scanner;

public class pp211 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter numerator: ");
    int num = input.nextInt();
    System.out.print("Enter denominator: ");
    int denom = input.nextInt();

    double decs = (double)num/denom;
    System.out.printf(num + "/" + denom + " is equivalent to " + decs + " in decimals.\n");
  }
}
