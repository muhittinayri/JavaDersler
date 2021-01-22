package com.javadersler.metodlar.overloading.main;

public class Driver {

	/*
	 * Overloading : Aþýrý yükleme anlamýna gelir. Metoda overloading yaptýðýmýz
	 * zaman o metodu bir farklý bir þekilde çaðýrabiliyoruz. Birden farklý bir
	 * þekilde kullanabiliyoruz. Metod overloadingde önemli olan metod isimlerinin
	 * ayný kalmasýdýr.
	 */
	
	
	/*
	public static void toplama(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlarý : " + (a + b + c));
	}

	public static void toplama(int a, int b) {
		System.out.println("Toplamlarý : " + (a + b));
	}
	 */
	
	public static void skorHesapla(String name,int puan) {
		System.out.println(name + " adlý oyuncunun " + puan + " puaný var...");
	}
	
	public static void skorHesapla(int puan) {
		System.out.println("Ýsimsiz oyuncunun " + puan + " puaný var...");
	}
	
	public static void skorHesapla(String name) {
		System.out.println(name + " adlý oyunucun hiç puaný yok...");
	}
	
	
	public static void main(String[] args) {
		/*toplama(5, 7);
		toplama(1, 2, 4);
		toplama("Muhittin", "AYRI");*/
		
		skorHesapla("Muti", 1000);
		skorHesapla("Memo");
		skorHesapla(1500);
	}
}
