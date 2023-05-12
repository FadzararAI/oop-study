import java.util.Scanner;
import java.lang.Math;
public class Circle{
    //static final double PI=3.14;
    private double radius;
    public void setRadius(double rad){
        radius = rad;
    }
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
	Circle circle1 = new Circle();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the radius of the circle: ");
	double rad = scan.nextDouble();
	circle1.setRadius(rad);
	System.out.printf("The perimeter of the circle: %.2f", circle1.getPerimeter());
	System.out.printf("\nThe area of the circle: %.2f\n", circle1.getArea());
    }
}

