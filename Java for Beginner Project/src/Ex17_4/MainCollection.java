package Ex17_4;
/*������� ������� � �������������� ������ (MainCollection � Athlete)
 * � �������������� �������� ��������� (String � int) ���������� ��� ����� � ������ ����������.
 * �������� �����������, ����������� ��� � �������.
 * ����������� ��� ���� ���������� getter � setter - ������.
 * �������� � MainCollection-������ ArrayList-��������� ��� �������� ���� Athlete ��� ��������� ��������� 
 * (�.�. ��� ������� � � �������� ��������� ������ ������ MainCollection).
 * � ������ main() ���������������� ��� 200-�� (������ "���-�������", ������ ��� - ���� � �� ��, ������� - 
 * ��������� 7-��������� �����).
 * ������� �� ������� ���������� ��������� ������ for/in (����� ���������� ������ Athlete ����������� � "��������")
 */
import java.util.ArrayList;
import java.util.Random;
public class MainCollection {
	
	private static ArrayList<Athlete>atl = new ArrayList<Athlete>();
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		for(int i=0; i<200; i++) {
			atl.add(new Athlete("Forostyana Victoria",rand.nextInt(9999999)));
		}	
		
		for(Athlete m: atl) {
			System.out.println(m.getName()+" "+m.getMobile());
		}
	}
	
}
