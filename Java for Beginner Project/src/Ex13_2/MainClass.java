package Ex13_2;
/*Открыть 2 окна, в каждом из которых:
 * 1. По нажатию кнопок запускается и останавливается  цикл 
 * от 0 до 1000 и выводится счетчик (с задержкой в 0,5 сек). 
  */
public class MainClass {

	public static void main(String[] args) {
		FirstFrame firstFrame = new FirstFrame("First");
		Thread thread1 = new Thread(firstFrame);  				//Creating the first additional thread
		Thread thread2 = new Thread(new FirstFrame("Second"));	//Creating the second additional thread
		thread1.start();
		thread2.start();
	}

}
