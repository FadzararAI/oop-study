import java.util.Scanner;
public class TP_if
{
        public static void main(String[] args) {
                Scanner selection = new Scanner(System.in);
                System.out.println("Total Points: ");
                int select = selection.nextInt();
                if(select>=100 && select<=199){
                    System.out.println("You won a free cup of teh-tarik");
                }else if(select>=200 && select<=299){
                    System.out.println("You won a free cup of teh-tarik and a regular-size doughnut");
                }
                else if(select>=300){
                    System.out.println("You won a free cup of teh-tarik and a regular-size doughnut and a 12-oz orange juice");
                }
                else{System.out.println("Invalid Total Points!");}
        }
}
