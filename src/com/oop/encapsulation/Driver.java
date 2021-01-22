package com.oop.encapsulation;

public class Driver {
	/*
	 * Encapsulation : Bir sýnýfýn detaylarýný özelliklerini baþka bir sýnýfa gizlemektir. Baþka bir sýnýfdan gizlemek
	 * 				   Bir sýnýfý public yapmak yerine private yapýyoruz. Bu bir encapsulationun özetidir.
	 * 				   Yani baþka bir sýnýfa kendi sýnýfýmýzýn özelliklerini kapsüllüyoruz yani detaylarý gizliyoruz
	 * 				   
	 */
		
	public static void main(String[] args) {
		/*Abone abone = new Abone();
		abone.isim = "Muhittin";
		abone.bakiye = 200;
		abone.sehir = "Ankara";
		
		abone.dogalgaz_kullan(200);*/
		
		
		GelismisAbone abone = new GelismisAbone("Muhittin AYRI", 200, "Ankara");
		abone.bakiye_ogren();  //bakiyeye 120  üzeri bir deðer girilse bile üst limit olan 120yi kadar sýnýrlar.
	}
	
}
