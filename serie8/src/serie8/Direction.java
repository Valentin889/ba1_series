package serie8;

import java.util.ArrayList;
import java.util.Iterator;

public class Direction {
	
	public static void main(String[] args) {
		
		ArrayList<EPFLiens> epflLiens = new ArrayList<EPFLiens>();
		ArrayList<EPFLiens> etudiants = new ArrayList<EPFLiens>();
		
		etudiants.add(new EtudiantEpfl("Gaston", "Peutimide", 2020, "section de systèmes de communication",6.0));
		etudiants.add(new EtudiantEpfl("Yvan", "Rattrapeur", 2016, "section de systèmes de communication",2.5));
		etudiants.add(new EtudiantEchange("Björn", "Borgue", 2018, "section d'informatique","KTH"));
		epflLiens.add(new Enseignant("Mathieu", "Matheu", 2015,
				"section de physique","Laboratoire des Mathématiques Extrêmement Pures (LMEP)",10000));
		epflLiens.add(new Secretaire("Sophie", "Scribona", 2005, "Laboratoire des Machines à Taper (LMT)",5000));		
		
		double somme = 0;
		int anneeCourant = 2021;
		
		for (EPFLiens etudiant : etudiants) {
			epflLiens.add(etudiant);
			somme +=  (anneeCourant-etudiant.getAnneeInscription());
		}
		
		
		System.out.println
			(
				"Parmis les " +
				epflLiens.size() + 
				" EPFLiens, " +
				etudiants.size() +
				" sont des étudiants. \n" +
				"Ils sont ici depuis en moyenne " +
				somme/etudiants.size() +
				" ans"
			);
		System.out.println("Listes des EPFLiens");
		
		for (EPFLiens lien : epflLiens) {
			System.out.println(lien.toString());
		}
		
		
		
		
		
	}
}
