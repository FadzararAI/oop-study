import java.util.Scanner;

public class TP_sw
{
        public static void main(String[] args) {
            Scanner selection = new Scanner(System.in);
                System.out.println("Total Points: ");
                int points = selection.nextInt();
                switch(points/100){
                    case 1:
                        System.out.println("You won a free cup of teh-tarik");
                        break;
                    case 2:
                        System.out.println("You won a free cup of teh-tarik and a regular-size doughnut");
                        break;
                    case 3:
                        System.out.println("You won a free cup of teh-tarik and a regular-size doughnut and a 12-oz orange juice");
                        break;
                    case 0:
                        System.out.println("Invalid points range!");
                        break;
                }
                    int npoints = points/100;
                    if(npoints>=4){
                        System.out.println("You won a free cup of teh-tarik and a regular-size doughnut and a 12-oz orange juice");
                    }
        }
}
