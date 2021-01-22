package com.oop.statickeyword.main;

/*
 * Static : �zelliklerimizi ve metotlar�m�z� static anahtar kelimesi ile yazd���m�z zaman bu �zellikler veya metotlar art�k bir objeye ba�l� de�il. 
 * s�n�fa ba�l� �zellikler veya metotlar oluyor. Yani bizim bu �zellikleri veya metotlar� kullanmam�z i�in art�k bir obje olu�turmam�za gerek kalm�yor
 * ve biz bunlara direkt olarak s�n�f ismi �zerinden eri�ebiliyoruz. Ayr�ca static tan�mlad���m�z t�m �zellikler ve metotlar program �al��t�r�ld��� zaman
 * bellekte direk olarak olu�uyorlar. Yani herhangi obje olu�turmaya gerek kalmadan bellekte direkt olarak olu�uyorlar
 * ve bunlar s�n�fa ait olduklar� i�in sadece ve sadece bir defa olu�uyorlar. Bir defa olu�tu�u i�in s�n�f �zerinden direkt olarak ula�abiliyoruz. 
 * 
 */

public class Driver {
	
	public static void selamla() {
		System.out.println("Selamlar...");
	}
	
	public static void main(String[] args) {
		/*Seyirci seyirci1 = new Seyirci("Muhittin");
		Seyirci seyirci2 = new Seyirci("Ali");
		
		seyirci1.oyun_seyret();
		
		System.out.println("Seyirci Say�s� : " + Seyirci.getSeyirciSaysisi());
		System.out.println("Seyirci Say�s� : " + seyirci1.getSeyirciSaysisi());
		System.out.println("Seyirci Say�s� : " + seyirci2.getSeyirciSaysisi());*/
		
		selamla();
		
		/*
		StaticClass staticClass1 = new StaticClass("Mehmet");
		StaticClass staticClass2 = new StaticClass("Muhittin");
		System.out.println("Obje Say�s� : " + StaticClass.obje_sayisi);
		System.out.println("Obje Say�s� : " + staticClass1.obje_sayisi);
		System.out.println("Obje Say�s� : " + staticClass2.obje_sayisi);
		*/
		
		toplama(3,4,5);
		
	}
	
	//E�er metot static olmasayd� Main metodu i�erisinde kullanamazd�k 
	public static void toplama (int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
