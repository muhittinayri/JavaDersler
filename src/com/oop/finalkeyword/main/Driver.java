package com.oop.finalkeyword.main;
/*
 * final : Final anahtar kelimesi ile tanýmlanan bir özelliði deðeri sadece ve sadece bir defa verilebiliyor. Yani o özelliðe deðer verdiðimiz zaman
 * baþka bir yerde bu özelliðin deðerini tekrardan deðiþtiremiyoruz.
 * Deðer verilirken tanýmlanýrken veya obje oluþturulurken constructor'ýn içerisinde verilebiliyor.
 *  
 */
public class Driver {
	public static void main(String[] args) {
		/*FinalTest finalTest = new FinalTest("Obje1");
		FinalTest finalTest2 = new FinalTest("Obje2");
		
		System.out.println("Obje Sayýsý : " + finalTest.obje_sayisi);
		System.out.println("Obje Sayýsý : " + finalTest2.obje_sayisi);*/
		
		
		System.out.println("Database Ýsmi : " + Database.databeseIsmi);
		System.out.println("UserName : " + Database.userName);
		System.out.println("Password : " + Database.password);
		
		
		
	}
}
