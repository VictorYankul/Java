package Ex09_3;
/*���������������� ������ ������ �� 5 ���������.
 * � ����� for() ��������� ��� ���������� �� 0 �� 4
 *  ������� ������ � ������, � ��������� ������ ������� ��������� ������.
 * ������� ��������� ������ �� ������� 
 * (���� ��� ������ {1,2,3}, �� ������� {-1,-2,-3}).
 */
public class CycleMassEmpty {

	public static void main(String[] args) {
		int massEmpty[] = new int[5];
		int invMass[] = new int[5];
		for(int i=0; i<5; i++){
			massEmpty[i] = i;
			invMass[i] = (0-massEmpty[i]);
			System.out.print(massEmpty[i]+" ");
		}
		System.out.println();
		for(int i=0; i<5; i++){System.out.print(invMass[i]+" ");}
	}
}
