import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CelciusPanel extends JPanel {
	private JTextField inCelcius, outFahrenheit;
	private JButton convert;
	public CelciusPanel(){
		inCelcius = new JTextField(5);
		outFahrenheit = new JTextField(5);
		convert = new JButton("Convert");
		convert.addActionListener(new TempListener());
		add(inCelcius);
		add(convert);
		add(outFahrenheit);
		setPreferredSize(new Dimension(300,75));
		setBackground(Color.cyan);
	}
	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			double CelciusTemp, FahrenheitTemp;
			String text = inCelcius.getText();
			CelciusTemp = Double.parseDouble(text);
			FahrenheitTemp = (CelciusTemp * 9/5) + 32;
			outFahrenheit.setText(Double.toString(FahrenheitTemp));
		}
	}
}