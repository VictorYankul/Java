package Ex13_1;
import java.util.Random; 
public class AddClass implements Runnable {
	int time;
	String name;
	Random r = new Random();
public AddClass(String name){
	this.name = name;
	time = r.nextInt(999);				//получили рандомное число от 0 до 999
}
	 public void run() {
		 System.out.printf("ѕоток %s спит %s милисекунд \n",name,time);
		 try {
			 Thread.sleep(time);
		 }catch(Exception e) {}
		 System.out.printf("ѕоток %s проснулс€ и закончилс€ \n",name);
	 }
}
