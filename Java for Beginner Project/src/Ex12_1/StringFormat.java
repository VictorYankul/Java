package Ex12_1;
/*������ � ������������ �������, ��� � ����� ����������.
 * � ������� ������� ���� Formatter �������� � ���� ����������������� ������ � �������� 
 */
import java.util.Formatter;
import java.util.Scanner;

public class StringFormat {
	static Formatter x;
	static Scanner scn;
	public static void main(String[] args) {
		try {
			x = new Formatter("res//2.txt");
			scn = new Scanner(System.in);
			System.out.println("������� ��� ���?");
			int years = (int)Double.parseDouble(scn.next());
			System.out.println("��� ��� �����?");
			String name = scn.next();
			System.out.println("��� �� ������?");
			String city = scn.next();
			
			x.format("��� %d ���, ���� ����� %s, � ���� � ������ %s.",years,name,city);
			x.close();
		
		}catch(Exception e) {}
	
	}

}
