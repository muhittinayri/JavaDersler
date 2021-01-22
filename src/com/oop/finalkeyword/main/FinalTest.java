package com.oop.finalkeyword.main;

public class FinalTest {
	//Tanýmlanýrken deðer verme
//	public final int obje_sayisi = 4;
//	
//	public FinalTest() {
//		//obje_sayisi = 5; Deðeri final anahtar kelimesi ile yazdýðýmýz için bir daha deðiþtiremiyoruz.  Deðeri 1 defa verebiliyoruz.
//	}
	
//	//Constructor'da deðer verme
//	public final int obje_sayisi;
//	
//	public FinalTest() {
//		obje_sayisi = 4;
//	}
	
	
	public final int obje_sayisi;
	private static int say = 0;
	
	private final String isim;
	
	public FinalTest(String isim) {
		this.isim = isim;
		say++;
		obje_sayisi = say;
		
	}

	public static int getSay() {
		return say;
	}

	public static void setSay(int say) {
		FinalTest.say = say;
	}
	
}
