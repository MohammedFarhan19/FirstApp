package de.mohammed.firstapp.firstCollection;

import java.util.ArrayList;
import java.util.List;

public class SecondTestCollection {

	public static void main(String[] args) {
		
		List<Angestellte> firmaAngestellte = new ArrayList<>();
		firmaAngestellte.add(new Angestellte("Tom", "München", false));
		firmaAngestellte.add(new Angestellte("Thomas", "München", false));
		firmaAngestellte.add(new Angestellte("Sara", "Frankfurt", true));
		firmaAngestellte.add(new Angestellte("Andreas", "Köln", true));
		firmaAngestellte.add(new Angestellte("Sabine", "Hamburg", false));
		System.out.println("======================  angestellteInMuenchen ======================");
		printMuenchenerAngestellte(firmaAngestellte, "münchen");
		System.out.println("======================  angestellteInKöln======================");
		printMuenchenerAngestellte(firmaAngestellte, "Köln");
		System.out.println("======================  angestellteInFrankfurt======================");
		printMuenchenerAngestellte(firmaAngestellte, "Frankfurt");
	}
	
	/**
	 * Methode um Angestellte jenach Wohnort auszugeben
	 * @param angestellteList
	 * @param Ort
	 */
	public static void printMuenchenerAngestellte(List<Angestellte> angestellteList, String Ort) {
		
		angestellteList.stream()
					   .filter(angestellteInMuenchen -> angestellteInMuenchen.getWohnOrtString().equalsIgnoreCase(Ort))
					   .forEach(angestellteInMuenchen -> System.out.println(angestellteInMuenchen.getName()));
					   
	}
}
