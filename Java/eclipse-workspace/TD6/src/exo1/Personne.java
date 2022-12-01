package exo1;

import java.io.Serializable;

public class Personne implements Serializable{
	//Attributes
	public String nom;
	public String prenom;
	public int age;
	public static int compteur;	
	public String nomObjet = "Humain " + Personne.compteur;
	//Constructor
	Personne(String nomParam, String prenomParam, int ageParam) {
		this.nom = nomParam;
		this.prenom = prenomParam;
		this.age = ageParam;

		compteur++;
	}
	
	//Getters and setters
	public String getNomObjet() {
		return nomObjet;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Methods
	public String toString() {
		
		return this.nomObjet + " : " + this.nom + " " + this.prenom + ", " + this.age + " ans.";
		
	}
}
