package com.oop.abstractclass.main;

/*
 * Abstract : Overread etmesi gerekmeyen metotlarý ve mutlaka ve mutlaka overread edilmesi gereken metotlarý bir classda biriktirip daha sonra bu classdan alt classlar üretmek istersek abstract anahtar kelimesi kullanýlýr.
 * Ýnterfaceler gibi objeler oluþturamýyoruz. Ancak abstract claslarýn referanslarý alt sýnýflara direk olarak referans olabiliyor
 * Abstract classlarda hem gövdeli hemde gövdesiz metot bulunuyor. Yeni hem soyut hem somut metotlarýmýz bulunuyor.
 * Abstract clasa özellik eklenebiliyor. Yani normal bir classa özellik eklenir gibi özellikler eklenebiliyor. 
 * Ve bir clasýn abstract olmasý demek en az bir tane abstract metot gövdesiz metotu bulunduðu anlamýna geliyor
 *  
 */

public class Driver {
	public static void main(String[] args) {
		
		Sekil sekil = new Kare("Kare2",6);
		
		Kare kare = new Kare("Kare1", 5);
		Daire daire = new Daire("Daire1", 3);
		
		sekil.alan_hesapla();
		kare.alan_hesapla();
		daire.alan_hesapla();
		kare.cevre_hesapla();
		
	}
}
