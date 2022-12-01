package exo1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	int port;
	
	Client(int port) {
		this.port = port;
		try {
			System.out.println("Création du client");
			Socket socket = new Socket(InetAddress.getLocalHost(), this.port);
			System.out.println("Client créé, num du port : " + this.port);
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return ("Client connecté au port n°" + this.port) ;
	}
	
}
