import java.util.Scanner;
import java.lang.Math;
public class ex1
{
	public static void main(String[] args) {
		Scanner rad = new Scanner(System.in);
		System.out.println("Enter radius of a circle:");
		double r = rad.nextDouble();
		double area = Math.PI * Math.pow(r,2);
		double perimeter = Math.PI * (r * 2);
		System.out.printf("\nRadius of circle: %.3f", r);
		System.out.printf("\nDiameter of circle: %.3f", (r * 2));
		System.out.printf("\nArea of circle: %.3f", area);
		System.out.printf("\nPerimeter of circle: %.3f", perimeter);
	}
}

