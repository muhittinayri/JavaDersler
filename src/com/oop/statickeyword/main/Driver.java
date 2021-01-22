package com.oop.statickeyword.main;

/*
 * Static : Özelliklerimizi ve metotlarýmýzý static anahtar kelimesi ile yazdýðýmýz zaman bu özellikler veya metotlar artýk bir objeye baðlý deðil. 
 * sýnýfa baðlý özellikler veya metotlar oluyor. Yani bizim bu özellikleri veya metotlarý kullanmamýz için artýk bir obje oluþturmamýza gerek kalmýyor
 * ve biz bunlara direkt olarak sýnýf ismi üzerinden eriþebiliyoruz. Ayrýca static tanýmladýðýmýz tüm özellikler ve metotlar program çalýþtýrýldýðý zaman
 * bellekte direk olarak oluþuyorlar. Yani herhangi obje oluþturmaya gerek kalmadan bellekte direkt olarak oluþuyorlar
 * ve bunlar sýnýfa ait olduklarý için sadece ve sadece bir defa oluþuyorlar. Bir defa oluþtuðu için sýnýf üzerinden direkt olarak ulaþabiliyoruz. 
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
		
		System.out.println("Seyirci Sayýsý : " + Seyirci.getSeyirciSaysisi());
		System.out.println("Seyirci Sayýsý : " + seyirci1.getSeyirciSaysisi());
		System.out.println("Seyirci Sayýsý : " + seyirci2.getSeyirciSaysisi());*/
		
		selamla();
		
		/*
		StaticClass staticClass1 = new StaticClass("Mehmet");
		StaticClass staticClass2 = new StaticClass("Muhittin");
		System.out.println("Obje Sayýsý : " + StaticClass.obje_sayisi);
		System.out.println("Obje Sayýsý : " + staticClass1.obje_sayisi);
		System.out.println("Obje Sayýsý : " + staticClass2.obje_sayisi);
		*/
		
		toplama(3,4,5);
		
	}
	
	//Eðer metot static olmasaydý Main metodu içerisinde kullanamazdýk 
	public static void toplama (int a, int b, int c) {
		System.out.println(a+b+c);
	}
}
