package Ex17_3;
/*Создать главный и дополнительный классы (Main и Athletes)
 * В дополнительном обьявить две приватные String-переменные для имени и номера мобильного.
 * Вставить конструктор, принимающий имя и телефон.
 * Реализовать для этих переменных getter и setter - методы.
 * Обьявить в Main-классе массив из 6-ти объектов типа Athlete как статичный приватный (т.е. вне медотов
 * и в пределах видимости класса Main). В методе main() инициализировать его любыми данными (парами "спортсмен-телефон").
 * Вывести на консоль массив объектов циклом for/in (через переменную класса Athlete обратившись к "геттерам")
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
