package com.oop.constructor.main;
// Obje olu�turdu�umuz zaman bu de�erleri direk olarak objenin i�erisine g�nderebiliyoruz. Daha sonra constructor b�t�n �zelliklere tek tek de�erlerini veriyor.
//Javada constructor olu�turmazsak JAVA default constructor olu�turmaktad�r.
//Constructorlar �zel metotlard�r. Class ismiyle ayn�d�r. �sim ayn� olmaz ise �a��r�lmaz ve constructor olmaz!
//Constructorlar objeler olu�turulurken ilk �a��r�lan fonksiyondur.!
//

public class Account {
	
	private String hesapNo;
	private Double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	//Constructor
	public Account() {
		System.out.println("Kendi yazd���m�z constructor..");
	}
	
	public Account(String hesapNo, double bakiye,String isim,String email,String telefonNo) {
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
	}
	
	public void paraYatir(double miktar) {
		this.bakiye += miktar;
		System.out.println("Yeni bakiye : " + bakiye);
	}
	
	public void paraCekme(double miktar) {
		if (miktar > 1500) {
			System.out.println("Bir g�nde 1.500 Tl'den fazla para �ekemezsiniz !");
		}
		if (bakiye - miktar < 0) {
			System.out.println("Yeterli bakiye yok ! Bakiye : " + bakiye);
		}
		else {
			bakiye -= miktar;
			System.out.println("Yeni bakiye : " + bakiye);
		}
	}
	
	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public Double getBakiye() {
		return bakiye;
	}
	public void setBakiye(Double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
}
