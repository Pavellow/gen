package exo1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serializer serial = new Serializer();
		Deserializer deserial = new Deserializer();
		Personne premierePersonne = new Personne("Pierre", "Jacques", 32);
		System.out.println(premierePersonne);
		Personne deuxiemePersonne = new Personne("Marechal", "Anto", 20);
		System.out.println(deuxiemePersonne);
		serial.serialize(premierePersonne);
		deserial.deserialize(premierePersonne);
		
		System.out.println("\n-----------------------------------------\n");
		
		Server server = new Server(8503);
		Client client = new Client(8503);
		System.out.println(server);
		System.out.println(client);
	}

}
