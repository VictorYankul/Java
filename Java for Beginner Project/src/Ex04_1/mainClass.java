/*
Написати програму, яка вивдодить введені користувачем 2 числа, збільшені на 1, при чому:
1. Метод, який вертає збільшені значення,знаходиться в головному класі.
2. Метод, який зчитує і запам"ятовує введені числа, знаходиться в допоміжному класі.
3. Результати виводить метод main().  
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
