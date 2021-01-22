package com.oop.finalkeyword.main;

public class FinalTest {
	//Tan�mlan�rken de�er verme
//	public final int obje_sayisi = 4;
//	
//	public FinalTest() {
//		//obje_sayisi = 5; De�eri final anahtar kelimesi ile yazd���m�z i�in bir daha de�i�tiremiyoruz.  De�eri 1 defa verebiliyoruz.
//	}
	
//	//Constructor'da de�er verme
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
