package Ex04_1;
import java.util.Scanner;
public class Reader {
	int x;
	int y;
	
	public void Scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		sc.close();
	}
	
}
