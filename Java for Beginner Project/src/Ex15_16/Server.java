package Ex15_16;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
	static public ServerSocket servSocket;
	static public Socket socket;
	static public ObjectInputStream servIn;
	static public ObjectOutputStream servOut;

	public void run() {
		try {
			servSocket = new ServerSocket(6969,10);	
			while(true) {
				socket = servSocket.accept();
				servIn = new ObjectInputStream(socket.getInputStream());
				servOut = new ObjectOutputStream(socket.getOutputStream());
				servOut.writeObject("You send "+(String)servIn.readObject());
			}
		}catch(Exception e){}
	}
}
