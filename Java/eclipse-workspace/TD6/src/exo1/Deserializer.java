package exo1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
	public static int compteurSerial;
	
	Deserializer() {
		compteurSerial++;
	}
	
	public void deserialize(Object a) {
		try {
			System.out.println("Deserialisation de l'objet...");
			FileInputStream oFile = new FileInputStream("object.json");
			ObjectInputStream flux = new ObjectInputStream(oFile);
			Object oe = (Object) flux.readObject();
			flux.close();
			System.out.println("Objet deserialisé, voici l'objet en question : \n" + oe);
		}catch(Exception e) {System.out.println(e);}
	}	
}