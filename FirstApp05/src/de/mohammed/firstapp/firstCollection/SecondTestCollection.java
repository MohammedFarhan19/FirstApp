package de.mohammed.firstapp.firstCollection;

import java.util.ArrayList;
import java.util.List;

public class SecondTestCollection {

	public static void main(String[] args) {
		
		List<Angestellte> firmaAngestellte = new ArrayList<>();
		firmaAngestellte.add(new Angestellte("Tom", "München", 5.6, false));
		firmaAngestellte.add(new Angestellte("Thomas", "München", 5.6 ,false));
		firmaAngestellte.add(new Angestellte("Sara", "Frankfurt", 70, true));
		firmaAngestellte.add(new Angestellte("Andreas", "Köln", 12.56, true));
		firmaAngestellte.add(new Angestellte("Sabine", "Hamburg", 10.03, false));
		
		System.out.println("======================  angestellteInMuenchen ======================");
		printMuenchenerAngestellte(firmaAngestellte, "münchen");
		System.out.println("======================  angestellteInKöln======================");
		printMuenchenerAngestellte(firmaAngestellte, "Köln");
		System.out.println("======================  angestellteInFrankfurt======================");
		printMuenchenerAngestellte(firmaAngestellte, "Frankfurt");
		System.out.println("======================  Anzahl der Einwohner > 11======================");
		int anzahl = printAnzahl(firmaAngestellte);
		System.out.println("Anzahl der Städte mit mehr als 11 Mil. Einwohner ist " + anzahl + " städte.");
	}
	
	/**
	 * Methode um Angestellte jenach Wohnort auszugeben
	 * @param angestellteList
	 * @param Ort
	 */
	public static void printMuenchenerAngestellte(List<Angestellte> angestellteList, String Ort) {
		//1- filter()
		angestellteList.stream()
					   .filter(angestellteInMuenchen -> angestellteInMuenchen.getWohnOrtString().equalsIgnoreCase(Ort))
					   .forEach(angestellteInMuenchen -> System.out.println(angestellteInMuenchen.getName()));
					   
	}
	
	/**
	 * Methode um zu zählen
	 * @param listAngestellte
	 * @return int anzahl
	 */
	public static int printAnzahl(List<Angestellte> listAngestellte) {
		// 2- count
		int anzahl = (int) listAngestellte.stream()
									.filter(zahl-> zahl.getAnwohnerZahl() > 11)
									.count();
		
		return anzahl;
									
	}
}
