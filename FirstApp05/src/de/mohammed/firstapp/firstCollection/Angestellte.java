package de.mohammed.firstapp.firstCollection;

public class Angestellte {

	private String name;
	private String wohnOrtString;
	private double anwohnerZahl;
	private boolean kannArbeiten;
	
	public Angestellte(String name, String wohnOrtString, double anwohnerZahl, boolean kannArbeiten) {
		this.name = name;
		this.wohnOrtString = wohnOrtString;
		this.anwohnerZahl = anwohnerZahl;
		this.kannArbeiten = kannArbeiten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWohnOrtString() {
		return wohnOrtString;
	}

	public void setWohnOrtString(String wohnOrtString) {
		this.wohnOrtString = wohnOrtString;
	}

	public boolean isKannArbeiten() {
		return kannArbeiten;
	}

	public void setKannArbeiten(boolean kannArbeiten) {
		this.kannArbeiten = kannArbeiten;
	}

	public double getAnwohnerZahl() {
		return anwohnerZahl;
	}

	public void setAnwohnerZahl(double anwohnerZahl) {
		this.anwohnerZahl = anwohnerZahl;
	}
	
}
