package Ex07_2;
/* 
�������� ������� �����������. ��������� ������� �� ������ � ������ �����,
������, ����������� ����������� ��������� � ������-���������, ������������ ������ ������ � GUI.
����� ������ � ������� � ��������������� ����������, ����������� ������ ��������� ������ 
��� ������� ������� "C" (Clear).

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