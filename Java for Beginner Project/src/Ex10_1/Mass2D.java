package Ex10_1;
/*Обьявить и заполнить двумерный массив int, состоящий из 5-ти строк. 
 * В строках 1-3 - по 3 символа, в строке 4 - 2 символа, в строке 5 - 5 символов.
 * Вывести массив построчно в консоль. 
 */
public class Mass2D {

	public static void main(String[] args) {
		int mass[][] = {{9,4,8},{2,3,6},{8,7,0},{1,2},{6,7,9,10,7}};
		for(int row = 0; row<mass.length; row++) {
			for(int col = 0; col<mass[row].length; col++) {
				System.out.print(mass[row][col]+" ");
			}
			System.out.println();
		}
	}
}