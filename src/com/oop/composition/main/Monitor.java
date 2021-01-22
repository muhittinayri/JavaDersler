package com.oop.composition.main;

public class Monitor {
	
	private String model;
	private String uretici;
	private String boyut;
	private Resolution resolution; //Resolution clasýndan bir tane objeyi oluþturulur. Composition budur. Monitor'ün içine resolution sýnýfýndan bir tane nesneyi koymuþ olduk. 
	
	public Monitor(String model, String uretici, String boyut, Resolution resolution ) {//Resolution clasýndan bir tane referans.
		this.model = model;
		this.uretici = uretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}
	
	public void monitoru_kapat() {
		System.out.println("Monitor kapatýlýyor...");	
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
