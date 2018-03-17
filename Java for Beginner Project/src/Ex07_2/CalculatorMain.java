package Ex07_2;
/* 
Написать простой калькулятор. Программа состоит из класса с точкой входа,
класса, содержащего графический интерфейс и класса-слушателя, находящегося внутри класса с GUI.
Кроме кнопок с цифрами и арифметическими действиями, калькулятор должен содержать кнопку 
для очистки дисплея "C" (Clear).

 */
public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorGUI calcGUI = new CalculatorGUI("Calculator");
		calcGUI.setVisible(true);
		calcGUI.setSize(215,250);
		calcGUI.setResizable(true);
		calcGUI.setLocationRelativeTo(null);
	}
}