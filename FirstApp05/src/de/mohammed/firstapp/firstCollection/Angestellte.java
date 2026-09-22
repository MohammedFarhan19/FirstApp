package de.mohammed.firstapp.firstCollection;

public class Angestellte {

	private String name;
	private String wohnOrtString;
	private boolean kannArbeiten;
	
	public Angestellte(String name, String wohnOrtString, boolean kannArbeiten) {
		this.name = name;
		this.wohnOrtString = wohnOrtString;
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
	
	
	
	
}
