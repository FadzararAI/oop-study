import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");

        JButton button = new JButton("Push Me");
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }
}
