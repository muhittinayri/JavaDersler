package com.oop.abstractclass.main;

/*
 * Abstract : Overread etmesi gerekmeyen metotlar� ve mutlaka ve mutlaka overread edilmesi gereken metotlar� bir classda biriktirip daha sonra bu classdan alt classlar �retmek istersek abstract anahtar kelimesi kullan�l�r.
 * �nterfaceler gibi objeler olu�turam�yoruz. Ancak abstract claslar�n referanslar� alt s�n�flara direk olarak referans olabiliyor
 * Abstract classlarda hem g�vdeli hemde g�vdesiz metot bulunuyor. Yeni hem soyut hem somut metotlar�m�z bulunuyor.
 * Abstract clasa �zellik eklenebiliyor. Yani normal bir classa �zellik eklenir gibi �zellikler eklenebiliyor. 
 * Ve bir clas�n abstract olmas� demek en az bir tane abstract metot g�vdesiz metotu bulundu�u anlam�na geliyor
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
