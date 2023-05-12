import javax.swing.JFrame;
public class CFConverters {
//-----------------------------------------------------------------
// Creates and displays the temperature converter GUI.
//-----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Celcius & Fahrenheit Converters");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CFConverter panel = new CFConverter();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
