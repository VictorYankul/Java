/*
�������� ��������, ��� ��������� ������ ������������ 2 �����, ������� �� 1, ��� ����:
1. �����, ���� ����� ������� ��������,����������� � ��������� ����.
2. �����, ���� ����� � �����"����� ������ �����, ����������� � ���������� ����.
3. ���������� �������� ����� main().  
*/
package Ex04_1;

public class mainClass {

	public static void main(String[] args) {
		
		Reader r = new Reader();
		r.Scan();
		r.x = count(r.x);
		r.y = count(r.y);
		
		System.out.println(r.x);
		System.out.println(r.y);
		
	}
	private static int count(int q) {
		q += 1;
		return q;
	}

}
