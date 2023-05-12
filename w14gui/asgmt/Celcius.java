import javax.swing.JFrame;
public class Celcius {
//-----------------------------------------------------------------
// Creates and displays the temperature converter GUI.
//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Celcius to Fahrenheit");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CelciusPanel panel = new CelciusPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
