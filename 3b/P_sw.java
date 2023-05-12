import java.util.Scanner;

public class P_sw
{
	public static void main(String[] args) {
	    Scanner selection = new Scanner(System.in);
		System.out.println("Points: ");
		int points = selection.nextInt();
		switch(points/10){
		    case 5:
		        System.out.println("Satisfactory");
		        break;
		    case 6:
		        System.out.println("Fairly Good");
		        break;
		    case 7:
		        System.out.println("Good");
		        break;
		    case 8:
		        System.out.println("Very Good");
		        break;
		    case 9:
		    case 10:
		        System.out.println("Excellent");
		        break;
		    default:
		        System.out.println("Invalid points range!");
		        break;
		}
	}
}

