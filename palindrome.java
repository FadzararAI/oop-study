import java.util.Scanner;
public class palindrome {
    public static boolean palindromecheck(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1;i<=x;i++){
            String str = st.nextLine();
            if (palindromecheck(str)) {
                System.out.print("Case #" + i);
                System.out.print(": Yes\n");
            }
            else{
                System.out.print("Case #" + i);
                System.out.print(": No\n");
            }
        }
    }
}

