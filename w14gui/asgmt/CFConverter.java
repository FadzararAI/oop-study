import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CFConverter extends JPanel {
	private JTextField inCelcius, outFahrenheit;
	private JRadioButton C2F, F2C;
	private JButton convert;
	public CFConverter(){
		C2F = new JRadioButton("Celcius to Fahrenheit");
		F2C = new JRadioButton("Fahrenheit to Celcius");
		// TempListener listener = new TempListener();
		// C2F.addActionListener(listener);
		// F2C.addActionListener(listener);
		// add(C2F);
		// add(F2C);
		ButtonGroup group = new ButtonGroup();
		group.add(C2F);
		group.add(F2C);
		convert = new JButton("Convert");
		convert.addActionListener(new TempListener());
		inCelcius = new JTextField(5);
		outFahrenheit = new JTextField(5);
		add(C2F);add(F2C);
		add(inCelcius);
		add(convert);
		add(outFahrenheit);
		setPreferredSize(new Dimension(300,75));
		setBackground(Color.cyan);
		setVisible(true);
	}
	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			double CelciusTemp, FahrenheitTemp;
			String text = inCelcius.getText();
			CelciusTemp = Double.parseDouble(text);
			Object source = event.getSource();
			if(C2F.isSelected()){
				FahrenheitTemp = (CelciusTemp * 9/5) + 32;
				outFahrenheit.setText(Double.toString(FahrenheitTemp));
			}
			if(F2C.isSelected()){
				FahrenheitTemp = ((CelciusTemp-32)*5)/9;
				outFahrenheit.setText(String.format("%.4f",FahrenheitTemp));
			}
		}
	}
}
