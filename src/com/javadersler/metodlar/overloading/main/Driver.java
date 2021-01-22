package com.javadersler.metodlar.overloading.main;

public class Driver {

	/*
	 * Overloading : A��r� y�kleme anlam�na gelir. Metoda overloading yapt���m�z
	 * zaman o metodu bir farkl� bir �ekilde �a��rabiliyoruz. Birden farkl� bir
	 * �ekilde kullanabiliyoruz. Metod overloadingde �nemli olan metod isimlerinin
	 * ayn� kalmas�d�r.
	 */
	
	
	/*
	public static void toplama(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlar� : " + (a + b + c));
	}

	public static void toplama(int a, int b) {
		System.out.println("Toplamlar� : " + (a + b));
	}
	 */
	
	public static void skorHesapla(String name,int puan) {
		System.out.println(name + " adl� oyuncunun " + puan + " puan� var...");
	}
	
	public static void skorHesapla(int puan) {
		System.out.println("�simsiz oyuncunun " + puan + " puan� var...");
	}
	
	public static void skorHesapla(String name) {
		System.out.println(name + " adl� oyunucun hi� puan� yok...");
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
