import java.util.Scanner;
public class even100
{
    public static void main(String[] args){
        int start = 0;
        while(start <= 100){
            start++;
            if(start % 2 == 0){
                System.out.println(start);
            }
        }
    }
}
