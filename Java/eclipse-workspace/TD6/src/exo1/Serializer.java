package exo1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	public static int compteurSerial;
	
	Serializer() {
		compteurSerial++;
	}
	
	public void serialize (Object a) {
		try {
			System.out.println("Serialisation de l'objet" + "...");
			FileOutputStream oFile = new FileOutputStream("object.json", false);
			ObjectOutputStream flux = new ObjectOutputStream(oFile);
			flux.writeObject(a);
			flux.close();
			System.out.println("Objet serialisé !");
		}catch(Exception e) {System.out.println(e);}
	}
}