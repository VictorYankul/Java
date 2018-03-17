package Ex17_3;
/*������� ������� � �������������� ������ (Main � Athletes)
 * � �������������� �������� ��� ��������� String-���������� ��� ����� � ������ ����������.
 * �������� �����������, ����������� ��� � �������.
 * ����������� ��� ���� ���������� getter � setter - ������.
 * �������� � Main-������ ������ �� 6-�� �������� ���� Athlete ��� ��������� ��������� (�.�. ��� �������
 * � � �������� ��������� ������ Main). � ������ main() ���������������� ��� ������ ������� (������ "���������-�������").
 * ������� �� ������� ������ �������� ������ for/in (����� ���������� ������ Athlete ����������� � "��������")
 * 
 */
public class Main {
	private static Athlete[] athletes = new Athlete[3];

	public static void main(String[] args) {
		athletes[0] = new Athlete("Forostyana Victoria", "(068)996-32-30");
		athletes[1] = new Athlete("Roshchina Ksenya", "(067)294-27-23");
		athletes[2] = new Athlete("Elena", "(096)849-95-01");
		
		for(Athlete at: athletes) {
			System.out.println(at.getName()+" "+at.getMobile());		}
	}

}
