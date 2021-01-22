package com.oop.car.metot.main;

public class Car {
	
	private String renk;
	private int kapýlar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	public void setModel(String model) {
		this.model = model;  
		/*
		 * this anahtar kelimesi bizim þuanki objemizin üzerinde olduðumuzu gösterir. Objenin özelliðine ulaþmak istediðimiz için this anahtar kelimesini kullanmamýz gerekiyor.
		 */
		
	}
	
	public String getModel() {
		return model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getKapýlar() {
		return kapýlar;
	}

	public void setKapýlar(int kapýlar) {
		if (kapýlar <= 0) {
			System.out.println("Kapýlar 0 ve 0 dan küçük olamaz!");
		}else {
			this.kapýlar = kapýlar;
		}
		
	}

	public int getTekerlekler() {
		return tekerlekler;
	}

	public void setTekerlekler(int tekerlekler) {
		this.tekerlekler = tekerlekler;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
}
