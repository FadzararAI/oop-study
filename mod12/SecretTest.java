public class SecretTest {
//-----------------------------------------------------------------
// Creates a Secret object and exercises its encryption.
//-----------------------------------------------------------------
	public static void main(String[] args) {
		Secret hush = new Secret("Wil Wheaton is my hero!");
		System.out.println(hush);
		hush.encrypt();
		System.out.println(hush);
		hush.decrypt();
		System.out.println(hush);
	}
}