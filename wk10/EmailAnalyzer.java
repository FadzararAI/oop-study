import java.util.Scanner;
public class EmailAnalyzer{
	public static void main(String[] args){
		Scanner escan = new Scanner(System.in);
		System.out.println("Enter Email Address: ");
		String email = escan.nextLine();
		EAddress addr = new EAddress(email);
		if(addr.isEmail()){
			System.out.println(email + " is an Email Address");
		}else{
			System.out.println(email + " is not an Email Address");
		}
	}
}
