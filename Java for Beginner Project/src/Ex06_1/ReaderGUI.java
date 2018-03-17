package Ex06_1;
import javax.swing.JOptionPane;

public class ReaderGUI {
	int x;
	int y;
	String n1;
	String n2;
	public void Scan() {
		n1 = JOptionPane.showInputDialog("Input the first number:");
		n2 = JOptionPane.showInputDialog("Input the second number:");
		x = Integer.parseInt(n1);
		y = Integer.parseInt(n2);
	}
	public void Scan(int first, int second) {
		JOptionPane.showMessageDialog(null,"Now the first number is: "+x);
		JOptionPane.showMessageDialog(null,"Now the second number is: "+y);
	}
}

