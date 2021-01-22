package com.oop.abstractclass.main;

public abstract class Sekil {
	private String isim;

	public Sekil(String isim) {
		this.isim = isim;
	}
	
	public void ismini_soyle() {
		System.out.println("Bu obje " + isim + " objesidir");
	}
	
	abstract void alan_hesapla(); //Gövdesiz metot - alt sýnýflar bu metotu mutlaka yazmak zorunda kalýyor

	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	
}
