public class Slogan {
	private String phrase;
	private static int count = 0;
//-----------------------------------------------------------------
// Constructor: Sets up the slogan and increments the number of
// instances created.
//-----------------------------------------------------------------
	public Slogan (String str) {
		phrase = str;
		count++;
	}
	public String toString() {
		return phrase;
	}
//-----------------------------------------------------------------
// Returns the number of instances of this class that have been
// created.
//-----------------------------------------------------------------
	public static int getCount () {
		return count;
	}
}
