package com.oop.composition.main;

public class Monitor {
	
	private String model;
	private String uretici;
	private String boyut;
	private Resolution resolution; //Resolution clas�ndan bir tane objeyi olu�turulur. Composition budur. Monitor'�n i�ine resolution s�n�f�ndan bir tane nesneyi koymu� olduk. 
	
	public Monitor(String model, String uretici, String boyut, Resolution resolution ) {//Resolution clas�ndan bir tane referans.
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}
	
	public void monitoru_kapat() {
		System.out.println("Monitor kapat�l�yor...");	
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	
	
}
