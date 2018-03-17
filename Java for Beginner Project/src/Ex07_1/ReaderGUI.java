package Ex07_1;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderGUI extends JFrame{
	
		EventHandler eventH = new EventHandler();
	
		int first,second;
		String inc1,inc2;
		
		JButton buttonCount;
		JButton buttonClear;
		JLabel firstLabel;
		JLabel secondLabel;
		JLabel firstInc;
		JLabel secondInc;
		JTextField firstField;
		JTextField secondField;
	
	public ReaderGUI(String s){
		super(s);
		FlowLayout flowL = new FlowLayout();
		this.setLayout(flowL);
		firstLabel = new JLabel("Enter the first number:");
		secondLabel = new JLabel("Enter the second number:");
		firstField = new JTextField(10);
		secondField = new JTextField(10);
		buttonClear = new JButton("Clear");
		buttonCount = new JButton("Count");
		firstInc = new JLabel("");
		secondInc = new JLabel("");
		
		
		add(buttonCount);
			buttonCount.addActionListener(eventH);
		add(buttonClear);
			buttonClear.addActionListener(eventH);
		add(firstLabel);
		add(firstField);
		add(secondLabel);
		add(secondField);
		add(firstInc);
		add(secondInc);
		
		
	}
	public class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == buttonCount) {
				first = Integer.parseInt(firstField.getText());
				first++;
				second = Integer.parseInt(secondField.getText());
				second++;
				inc1 = "Your first number now is: "+first;
				inc2 = "Your second number now is: "+second;
				firstInc.setText(inc1);
				secondInc.setText(inc2);
			} else if(e.getSource() == buttonClear) {
				firstField.setText(null);
				secondField.setText(null);
				firstInc.setText(null);
				secondInc.setText(null);
			}
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"Please enter the number");
		  }
			
		}
	}
}
