public class Main{
	public static void main(String args[]){
		Cipherer text = new Cipherer("This is a test from Fadzarar");
		System.out.println(text);
		text.encrypt();
		System.out.println(text);
		text.decrypt();
		System.out.println(text);
	}
}
