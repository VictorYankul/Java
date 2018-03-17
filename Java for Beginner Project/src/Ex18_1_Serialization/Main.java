package Ex18_1_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/* Создать дополнительный класс профиля с параметрами "имя" и "фамилия" (включая getters and setters) и конструктором.
 * В главном методе создать коллекцию из объектов класса Profile.
 * Каждый раз при запуске программы (метода main()):
 * 1. Cоздается объект типа Profile.
 * 2. Диалоговым окном запрашиваются имя/фамилия 
 * 3. Созданный профиль добавить в коллекцию.
 * 4. Вывести содежимое коллекции
 * Для сохранения профилей применить сериализацию, причем сериализация и десериализация 
 * должны происходить в двух разных методах главного класса (для этого: в класс Profile имплементируйте 
 * интерфейс Serializable. Воспользуйтесь потоками данных FileInputStream и ObjectInputStream).
 * Алгоритм такой: программа достает из файла коллекцию - добавляет к коллекции объект - запихивает коллекцию в файл.   
 */ 
public class Main {
	
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	public static void main(String[] args) {
		
		profiles = (ArrayList<Profile>)deserialData("arrayprofile");	//достаем коллекцию из файла
		
		System.out.println(profiles.size());
		Profile profile = new Profile();
		profile.setSurname(JOptionPane.showInputDialog("Input surname"));
		profile.setName(JOptionPane.showInputDialog("Input name"));
		profile.setMobile(JOptionPane.showInputDialog("Input mobile as (xxx)xxx-xx-xx"));
		profiles.add(profile);											//добавляем объект к коллекции
		for(Profile p: profiles) {
			System.out.println(p.getSurname()+" "+p.getName()+" "+p.getMobile());
		}
		System.out.println(profiles.size());
		
		serialData(profiles);											//записываем коллекцию в файл
	}
	private static void serialData(Object obj) {
		try {
			FileOutputStream fileOut = new FileOutputStream("arrayprofiles"+".srl");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(obj);
			fileOut.close();
			objectOut.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Input/output exception");
			System.exit(2);
		}
	}
	private static Object deserialData(String filename) {
		Object retObject = null;
		try {
			FileInputStream fileIn = new FileInputStream(filename+".srl");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			retObject = objectIn.readObject();
			fileIn.close();
			objectIn.close();
			}catch(FileNotFoundException e) {
				System.out.println("File not found");
				System.exit(1);
			}catch(IOException e) {
				System.out.println("Input/output exception");
				System.exit(2);
			}catch(ClassNotFoundException e) {
				System.out.println("Class Not Found");
				System.exit(3);
			}
			return retObject;
		}

}
