package Ex12_1;
/*Узнать у пользователя возраст, имя и город проживания.
 * С помощью обьекта типа Formatter записать в файл отформатированную строку с ответами 
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
			System.out.println("Сколько Вам лет?");
			int years = (int)Double.parseDouble(scn.next());
			System.out.println("Как Вас зовут?");
			String name = scn.next();
			System.out.println("Где Вы живете?");
			String city = scn.next();
			
			x.format("Мне %d лет, меня зовут %s, я живу в городе %s.",years,name,city);
			x.close();
		
		}catch(Exception e) {}
	
	}

}
