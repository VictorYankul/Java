package Ex09_3;
/*Инициализировать пустой массив из 5 элементов.
 * В цикле for() заполнить его элементами от 0 до 4
 *  Вывести массив в строке, а следующей строке вывести инверсный массив.
 * вывести инверсный массив на консоль 
 * (если был массив {1,2,3}, то вывести {-1,-2,-3}).
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
