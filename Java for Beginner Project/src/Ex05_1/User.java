/*
Создать суперкласс с методом, выводящим строку, создать 3 его подкласса.
Отдельно - класс user с точкой входа. 
В одном из подклассов переопределить метод из суперкласса.
Объявить суперкласс как абстрактный.
Обьявить метод из суперкласса как абстрактый и переопределить его каждый раз при испрользовании  
 */


package Ex05_1;

public class User {

	public static void main(String[] args) {
		Vika v = new Vika();
		Kristina k = new Kristina();
		Albina a = new Albina();
	
		
		v.whoseAreYou();
		k.whoseAreYou();
		a.whoseAreYou();
	}

}
