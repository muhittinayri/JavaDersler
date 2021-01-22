package com.oop.finalkeyword.main;
/*
 * final : Final anahtar kelimesi ile tan�mlanan bir �zelli�i de�eri sadece ve sadece bir defa verilebiliyor. Yani o �zelli�e de�er verdi�imiz zaman
 * ba�ka bir yerde bu �zelli�in de�erini tekrardan de�i�tiremiyoruz.
 * De�er verilirken tan�mlan�rken veya obje olu�turulurken constructor'�n i�erisinde verilebiliyor.
 *  
 */
public class Driver {
	public static void main(String[] args) {
		/*FinalTest finalTest = new FinalTest("Obje1");
		FinalTest finalTest2 = new FinalTest("Obje2");
		
		System.out.println("Obje Say�s� : " + finalTest.obje_sayisi);
		System.out.println("Obje Say�s� : " + finalTest2.obje_sayisi);*/
		
		
		System.out.println("Database �smi : " + Database.databeseIsmi);
		System.out.println("UserName : " + Database.userName);
		System.out.println("Password : " + Database.password);
		
		
		
	}
}
