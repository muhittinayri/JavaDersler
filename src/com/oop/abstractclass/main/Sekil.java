package com.oop.abstractclass.main;

public abstract class Sekil {
	private String isim;

	public Sekil(String isim) {
		this.isim = isim;
	}
	
	public void ismini_soyle() {
		System.out.println("Bu obje " + isim + " objesidir");
	}
	
	abstract void alan_hesapla(); //G�vdesiz metot - alt s�n�flar bu metotu mutlaka yazmak zorunda kal�yor

	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	
}
