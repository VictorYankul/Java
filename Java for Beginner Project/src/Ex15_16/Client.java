/*Написать класс-клиент, отправляющий в класс-сервер сообщение в текстовом поле фрейма 
 * по нажатию кнопки. Класс-сервер должен возвратить сообщение с припиской.
 */

package Ex15_16;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Client extends JFrame implements Runnable {
	
	static private Socket socket;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	
	
	
	public Client(String name) {
		super(name);
		
		setLayout(new FlowLayout());
		setSize(300,200);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JTextField textField = new JTextField(10);
		JButton button = new JButton("Send");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource() == button) {
					sendData(textField.getText());
				}
			}
		});

		add(textField);
		add(button);
	}
public static void main(String[] args) {
		
		new Thread(new Client("My ClientSize")).start();
		new Thread(new Server()).start();
		
	}
	
	public void run() {
		try {
			while(true) {
				socket = new Socket(InetAddress.getByName("127.0.0.1"),6969);
				output = new ObjectOutputStream(socket.getOutputStream());
				input = new ObjectInputStream(socket.getInputStream());
				JOptionPane.showMessageDialog(null,(String)input.readObject());
			}
			
		}	catch (IOException e){ }
			catch (HeadlessException e) {System.out.println("Headless Exception");}
			catch (ClassNotFoundException e){}
	}
	
	private static void sendData(Object obj){
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {}
	}
}



