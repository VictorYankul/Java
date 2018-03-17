package Ex11_1;
/*Создать текстовый файл, состоящий из 5-ти строк по 3 слова в каждой.
 * Написать программу, считывающую файл, сохраняющую его в двухмерном массиве
 * и выводящую содержимое массива на консоль
 */
import java.util.Scanner;
import java.io.File;

public class ReadOpenFile {
	static String mass[][] = new String[5][3];
	static Scanner scn;
	
	public static void main(String args[]) {
		fileOpen();
		fileReader();
		fileOut();
	}
	private static void fileOpen() {
		try {
		scn = new Scanner(new File("res//1.txt"));
		}catch(Exception e) {System.out.println("File not find!");}
	}
	private static void fileReader() {
		while(scn.hasNext()) {
			for(int row=0; row<mass.length; row++) {
				for(int col=0; col<mass[row].length; col++) {
					mass[row][col] = scn.next();
				}
			}
		}
	}
	private static void fileOut() {
		for(int row=0; row<mass.length; row++) {
			for(int col=0; col<mass[row].length; col++) {
				System.out.print(mass[row][col]+" ");
			}
			System.out.println();
		}
	}
}
