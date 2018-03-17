package Ex17_2;
/*Обьявить и инициализировать строковый массив.
 * Вывести его содержимое, используя улучшенный цикл for/in
 */
public class ForinLoop {

	public static void main(String[] args) {
		String[] names = new String[] {"Victor","Oksana","Dionis"};
		for(String n: names) {
			System.out.println(n);
		}
	}
}
