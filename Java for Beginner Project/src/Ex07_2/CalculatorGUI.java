package Ex07_2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class CalculatorGUI extends JFrame{
	String displayText = "";
	double displayNumber = 0;
	double first;
	double result;
	String function = "";
	
	BorderLayout borderL = new BorderLayout();
	FlowLayout flowL = new FlowLayout();
	JPanel mainPanel;
	JTextField display;
	
	JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
	JButton buttPlus,buttMinus,buttMult,buttDiv, buttClear;
	JButton equal;
	
	JPanel numeralsPanel;
	JPanel buttonsPanel;

	EventHandler eHandler = new EventHandler();

	public CalculatorGUI(String s) {
	super(s);
	
		mainPanel = new JPanel();
		mainPanel.setLayout(borderL);
		
		display = new JTextField();
		mainPanel.add(display,"North");
/////////////цифровая панель//////////////////	
		numeralsPanel = new JPanel();
		numeralsPanel.setLayout(flowL);
		numeralsPanel.setPreferredSize(new Dimension(150,200));
//1		
		button1 = new JButton("1");
		numeralsPanel.add(button1);
		button1.addActionListener(eHandler);
//2		
		button2 = new JButton("2");
		numeralsPanel.add(button2);
		button2.addActionListener(eHandler);
//3		
		button3 = new JButton("3");
		numeralsPanel.add(button3);
		button3.addActionListener(eHandler);
//4
		button4 = new JButton("4");
		numeralsPanel.add(button4);
		button4.addActionListener(eHandler);
//5
		button5 = new JButton("5");
		numeralsPanel.add(button5);
		button5.addActionListener(eHandler);
//6
		button6 = new JButton("6");
		numeralsPanel.add(button6);
		button6.addActionListener(eHandler);
//7
		button7 = new JButton("7");
		numeralsPanel.add(button7);
		button7.addActionListener(eHandler);
//8
		button8 = new JButton("8");
		numeralsPanel.add(button8);
		button8.addActionListener(eHandler);
//9
		button9 = new JButton("9");
		numeralsPanel.add(button9);
		button9.addActionListener(eHandler);
//0
		button0 = new JButton("0");
		numeralsPanel.add(button0);
		button0.addActionListener(eHandler);
		
		mainPanel.add(numeralsPanel,"West");
/////////////////панель функций//////////////////////		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(flowL);
		buttonsPanel.setPreferredSize(new Dimension(50,200));
// +
		buttPlus = new JButton("+");
		buttonsPanel.add(buttPlus);
		buttPlus.addActionListener(eHandler);
// -		
		buttMinus = new JButton("-");
		buttonsPanel.add(buttMinus);
		buttMinus.addActionListener(eHandler);
// *		
		buttMult = new JButton("*");
		buttonsPanel.add(buttMult);
		buttMult.addActionListener(eHandler);
// /
		buttDiv = new JButton("/");
		buttonsPanel.add(buttDiv);
		buttDiv.addActionListener(eHandler);
//Clear		
		buttClear = new JButton("C");
		buttonsPanel.add(buttClear);
		buttClear.addActionListener(eHandler);
		
		mainPanel.add(buttonsPanel,"East");
//=		
		equal = new JButton("=");
		mainPanel.add(equal,"South");
		equal.addActionListener(eHandler);
		this.add(mainPanel);
		
	}
//метод, возвращающий результат арифметического действия	
	public double equivalent(double f, String func, double s) {
		if(func == "+") {
			return f+s;
		}else if(func == "-") {
			return f-s;
		}else if(func == "*") {
			return f*s;
			}
		return f/s;
	}
//Слушатель///////////////////////////////////////////////
	public class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				displayText = display.getText()+button1.getText();
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button2) {
				displayText = display.getText()+button2.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button3) {
				displayText = display.getText()+button3.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button4) {
				displayText = display.getText()+button4.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button5) {
				displayText = display.getText()+button5.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button6) {
				displayText = display.getText()+button6.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button7) {
				displayText = display.getText()+button7.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button8) {
				displayText = display.getText()+button8.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button9) {
				displayText = display.getText()+button9.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
			if(e.getSource() == button0) {
				displayText = display.getText()+button0.getText(); 
				display.setText(displayText);
				displayNumber = Integer.parseInt(displayText);
			}
//определить арифметическое действие и очистить дисплей
			if(e.getSource() == buttPlus) {
				function = buttPlus.getText();
				first = displayNumber;
				display.setText(null);
			}
			if(e.getSource() == buttMinus) {
				function = buttMinus.getText();
				first = displayNumber;
				display.setText(null);
			}
			if(e.getSource() == buttMult) {
				function = buttMult.getText();
				first = displayNumber;
				display.setText(null);
			}
			if(e.getSource() == buttDiv) {
				function = buttDiv.getText();
				first = displayNumber;
				display.setText("");
			}
			if(e.getSource() == buttClear) {
				display.setText(null);
			}
//Показать результат при нажатии на кнопку "="			
			if(e.getSource() == equal) {
				result = equivalent(first,function,displayNumber);
				String res = ""+result;
				display.setText(res);
			}
		}
	}
}