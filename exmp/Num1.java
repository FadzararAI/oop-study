import java.util.Scanner;
public class Num1
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int max = scan.nextInt();
	    int rices[] = {0,0,0,0,0};
	    for(int i = 1; i <= max;i++){
	        for(int x = 0; x < 5;x++){
	            rices[x] = scan.nextInt();
	        }
	        int rice_compare = rices[0];
	        for (int j=0; j<5; j++)
            {
                if(rice_compare < rices[j]){
                    rice_compare = rices[j];
                }
            }
            System.out.println("Case #" + i + ": " + rice_compare);
	    }
	}
}

