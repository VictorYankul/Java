package Ex18_1_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/* ������� �������������� ����� ������� � ����������� "���" � "�������" (������� getters and setters) � �������������.
 * � ������� ������ ������� ��������� �� �������� ������ Profile.
 * ������ ��� ��� ������� ��������� (������ main()):
 * 1. C�������� ������ ���� Profile.
 * 2. ���������� ����� ������������� ���/������� 
 * 3. ��������� ������� �������� � ���������.
 * 4. ������� ��������� ���������
 * ��� ���������� �������� ��������� ������������, ������ ������������ � �������������� 
 * ������ ����������� � ���� ������ ������� �������� ������ (��� �����: � ����� Profile ��������������� 
 * ��������� Serializable. �������������� �������� ������ FileInputStream � ObjectInputStream).
 * �������� �����: ��������� ������� �� ����� ��������� - ��������� � ��������� ������ - ���������� ��������� � ����.   
 */ 
public class Main {
	
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	public static void main(String[] args) {
		
		profiles = (ArrayList<Profile>)deserialData("arrayprofile");	//������� ��������� �� �����
		
		System.out.println(profiles.size());
		Profile profile = new Profile();
		profile.setSurname(JOptionPane.showInputDialog("Input surname"));
		profile.setName(JOptionPane.showInputDialog("Input name"));
		profile.setMobile(JOptionPane.showInputDialog("Input mobile as (xxx)xxx-xx-xx"));
		profiles.add(profile);											//��������� ������ � ���������
		for(Profile p: profiles) {
			System.out.println(p.getSurname()+" "+p.getName()+" "+p.getMobile());
		}
		System.out.println(profiles.size());
		
		serialData(profiles);											//���������� ��������� � ����
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
