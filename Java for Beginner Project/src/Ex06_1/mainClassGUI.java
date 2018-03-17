/*
 * Усовершенствовать программу из упражнения 4_1: 
 * 1. Обеспечить ввод чисел через диалоговое окно.
 * 2. Вывод результатов производится из подкласса
 * 3. Метод подкласса, который выводит результаты, должен быть переопределен из метода ввода.
*/

package Ex06_1;

public class mainClassGUI {
	public static void main(String[] args) {
			ReaderGUI r = new ReaderGUI();
			r.Scan();
			r.x = count(r.x);
			r.y = count(r.y);
			r.Scan(r.x, r.y);
		}
		private static int count(int q) {
			q += 1;
			return q;
		}
	}
