package Ex17_4;
/*Создать главный и дополнительный классы (MainCollection и Athlete)
 * В дополнительном обьявить приватные (String и int) переменные для имени и номера мобильного.
 * Вставить конструктор, принимающий имя и телефон.
 * Реализовать для этих переменных getter и setter - методы.
 * Обьявить в MainCollection-классе ArrayList-коллекцию для объектов типа Athlete как статичную приватную 
 * (т.е. вне медотов и в пределах видимости только класса MainCollection).
 * В методе main() инициализировать его 200-ми (парами "имя-телефон", причем имя - одно и то же, телефон - 
 * рандомное 7-мизначное число).
 * Вывести на консоль содержимое клддекции циклом for/in (через переменную класса Athlete обратившись к "геттерам")
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
