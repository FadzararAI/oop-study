import java.util.Scanner;

public class pp26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter hours: ");
    int h = input.nextInt();
    System.out.print("Enter minutes: ");
    int m = input.nextInt();
    System.out.print("Enter seconds: ");
    int s = input.nextInt();

    int secs = (h * 3600) + (m * 60) + s;
    System.out.printf(h + " hours, " + m + " minutes and " + s + " seconds is equivalent to "+ secs +" seconds.\n");
  }
}
