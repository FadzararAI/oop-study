import java.util.Scanner;
public class P_if
{
	public static void main(String[] args) {
		Scanner selection = new Scanner(System.in);
		System.out.println("Points: ");
		int select = selection.nextInt();
		if(select>=50 && select<=59){
		    System.out.println("Satisfactory");
		}else if(select>=60 && select<=69){
		    System.out.println("Fairly Good");
		}
		else if(select>=70&&select<=79){
		    System.out.println("Good");
		}
		else if(select>=80&&select<=89){
		    System.out.println("Very Good");
		}
		else if(select>=90&&select<=100){
		    System.out.println("Excellent");
		}
		else{System.out.println("Unknown Points!");}
	}
}

