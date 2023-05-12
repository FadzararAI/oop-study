public class ex2
{
	public static void main(String[] args) {
	    String university = new String("Sampoerna University ");
	    String town = new String("Jakarta, Indonesia");
	    int stringLength = university.length();
	    String change1 = university.toUpperCase();
	    String change2 = change1.replace('O','*');
	    String change3 = university.concat(town);
	    System.out.println("String length: " + stringLength);
	    System.out.println("Change 1: " + change1);
	    System.out.println("Change 2: " + change2);
	    System.out.println("Change 3: " + change3 + "\n");
	}
}

