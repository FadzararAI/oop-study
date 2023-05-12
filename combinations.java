import java.util.Scanner;

public class combinations {
    public static void combinations(String prefix, String s, int n, int k, int start) {
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = start; i < n; i++) {
            combinations(prefix + s.charAt(i), s, n, k - 1, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int testCases = sc.nextInt();
        for (int t = 1; t <= testCases; t++) {
            System.out.print("Enter n (length of the alphabet set) for test case " + t + ": ");
            int n = sc.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                s += (char) ('A' + i);
            }
            System.out.print("Enter k (length of the combinations) for test case " + t + ": ");
            int k = sc.nextInt();
            System.out.println("Combinations for test case " + t + ":");
            combinations("", s, n, k, 0);
            System.out.println();
        }
    }
}

