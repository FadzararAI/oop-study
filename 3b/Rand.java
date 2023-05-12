import java.util.Random;
import java.util.Scanner;
public class Rand
{
        public static void main(String[] args) {
                Random random = new Random();
                Scanner value = new Scanner(System.in);
                int gen = random.nextInt();
                System.out.println("Type an integer number: ");
                int val = value.nextInt();
                System.out.println("Your input: " + val);
                System.out.println("Compared number: " + gen);
                if(val < gen) System.out.println("Your input number is lower than the randomized number.");
                else if(val > gen) System.out.println("Your input number is higher than the randomized number.");
        }
}

