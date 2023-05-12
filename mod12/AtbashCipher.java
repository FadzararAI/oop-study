import java.util.Scanner;
public class AtbashCipher {

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        String insentence = st.nextLine();
        String ciphertext = encrypt(insentence);
        String decrypted = decrypt(ciphertext);
        System.out.println("Plaintext: " + insentence);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String plaintext) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char) ('Z' - (c - 'A'));
                } else {
                    c = (char) ('z' - (c - 'a'));
                }
            }
            ciphertext += c;
        }
        return ciphertext;
    }

    public static String decrypt(String ciphertext) {
        return encrypt(ciphertext);
    }

}
