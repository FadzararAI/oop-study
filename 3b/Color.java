import java.util.Scanner;

public class Color
{
        public static void main(String[] args) {
            Scanner selection = new Scanner(System.in);
                System.out.println("Color selection: ");
                int msg = selection.nextInt();
                switch(msg){
                    case 1:
                        System.out.println("Blue");
                        break;
                    case 2:
                        System.out.println("Green");
                        break;
                    case 3:
                        System.out.println("Red");
                        break;
                    case 4:
                        System.out.println("Yellow");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
        }
}
