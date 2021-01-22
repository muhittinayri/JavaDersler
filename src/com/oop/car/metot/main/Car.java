package com.oop.car.metot.main;

public class Car {
	
	private String renk;
	private int kap�lar;
	private int tekerlekler;
	private String motor;
	private String model;
	
	public void setModel(String model) {
		this.model = model;  
		/*
		 * this anahtar kelimesi bizim �uanki objemizin �zerinde oldu�umuzu g�sterir. Objenin �zelli�ine ula�mak istedi�imiz i�in this anahtar kelimesini kullanmam�z gerekiyor.
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

	public int getKap�lar() {
		return kap�lar;
	}

	public void setKap�lar(int kap�lar) {
		if (kap�lar <= 0) {
			System.out.println("Kap�lar 0 ve 0 dan k���k olamaz!");
		}else {
			this.kap�lar = kap�lar;
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
