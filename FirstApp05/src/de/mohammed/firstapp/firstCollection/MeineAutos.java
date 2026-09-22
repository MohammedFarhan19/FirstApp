package de.mohammed.firstapp.firstCollection;

public class MeineAutos {

	private String ModelName;
	private double price;
	private boolean reparaturbeduerftig;
	
	
	public MeineAutos(String modelName, double price, boolean reparaturbeduerftig) {
		this.ModelName = modelName;
		this.price = price;
		this.reparaturbeduerftig = reparaturbeduerftig;
	}


	public String getModelName() {
		return ModelName;
	}


	public void setModelName(String modelName) {
		ModelName = modelName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isReparaturbeduerftig() {
		return reparaturbeduerftig;
	}


	public void setReparaturbeduerftig(boolean reparaturbeduerftig) {
		this.reparaturbeduerftig = reparaturbeduerftig;
	}
	
}
