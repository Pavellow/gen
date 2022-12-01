package exo1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	int port;
	private static int compteur;
	
	Server(int port) {
		this.port = port;
		compteur++;
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("Serveur créé ! Numéro du port : " + this.port);
			Socket socket = server.accept();
			System.out.println("Nouvel utilisateur connecté");
			System.out.println("Fermeture du socket...");
			socket.close();
			System.out.println("Fermeture du serveur...");
			server.close();
			System.out.println("Serveur fermé !");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	int getPort() {
		return this.port;
	}
	
	void setPort(int portParam) {
		this.port = portParam;
	}
	
	public String toString() {
		return ("Serveur n°" + Server.compteur + " | Port n°" + this.port) ;
	}
}
