package Ex13_2;
/*������� 2 ����, � ������ �� �������:
 * 1. �� ������� ������ ����������� � ���������������  ���� 
 * �� 0 �� 1000 � ��������� ������� (� ��������� � 0,5 ���). 
  */
public class MainClass {

	public static void main(String[] args) {
		FirstFrame firstFrame = new FirstFrame("First");
		Thread thread1 = new Thread(firstFrame);  				//Creating the first additional thread
		Thread thread2 = new Thread(new FirstFrame("Second"));	//Creating the second additional thread
		thread1.start();
		thread2.start();
	}

}
