package com.javadersler.metodlar.main;

import java.util.Scanner;

public class Driver {
	/*
	 * Belirli bir iþi yapan ve sürekli kullanýlabilen bir yapýlardýr.
	 * 
	 * Bir defa tanýmlanýr her çaðýrýldýðýnda metod içerisindeki iþler yapýlýr.
	 * 
	 * Eriþim_Belirleyici(Opsiyonel) - Ekstra_Özellikler - Dönüþ Tipi - Fonksiyon Adý (Parametreler){
	 * 
	 * }
	 */

	//Parametresiz Metod
	public static void parametresizSelamlama() {
		System.out.println("Selam");
		System.out.println("Nasýlsýn");
	}
	
	//Parametresiz Faktoriyel Methodu
	public static void parametresizFaktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz : ");
		
		int sayi = scanner.nextInt();
		int faktoriyel = 1;
		
		
		while (sayi > 0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktoriyel = " + faktoriyel);
	}
	
	
	//parametreli method
	public static void parametreliSelamlama(String name) {
		System.out.println("Selam " + name);
	}
	
	//parametreli method
	public static void toplama(int a, int b,int c) {
		System.out.println("Sayýlarýn Toplamý : " + (a+b+c));
	}
	
	// Return : Bir fonksiyondan dönen deðeri baþka bir fonksiyonda kullanmak isteyebiliriz, buralarda fonksiyonlarýmýza return anahtar kelimesinin kullanýlmasý gerekiyor.
	//Returnden sonraki hiçbir kod çalýþmaz!! Return fonksiyonun son iþlemidir. Returnden sonra hiçbir þey çalýþmaz.
	public static int returnToplama(int a, int b, int c) {
		return (a+b+c);
	}
	
	public static int ikiilecarp(int a) {
		return a*2;
	}
	
	public static int ikiiletopla(int a) {
		return a+2;
	}
	
	public static int dortilecarp(int a) {
		return a*4;
	}
	
	public static void main(String[] args) {
		//parametresizSelamlama();
		//parametresizFaktoriyel();
		//parametreliSelamlama("Mehmet");
		//toplama(5, 6, 7);
		//System.out.println("Çýktý Sonucu : " + returnToplama(1, 2, 3));
		System.out.println("Sonuc : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
	}

}
