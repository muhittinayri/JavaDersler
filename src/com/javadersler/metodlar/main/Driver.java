package com.javadersler.metodlar.main;

import java.util.Scanner;

public class Driver {
	/*
	 * Belirli bir i�i yapan ve s�rekli kullan�labilen bir yap�lard�r.
	 * 
	 * Bir defa tan�mlan�r her �a��r�ld���nda metod i�erisindeki i�ler yap�l�r.
	 * 
	 * Eri�im_Belirleyici(Opsiyonel) - Ekstra_�zellikler - D�n�� Tipi - Fonksiyon Ad� (Parametreler){
	 * 
	 * }
	 */

	//Parametresiz Metod
	public static void parametresizSelamlama() {
		System.out.println("Selam");
		System.out.println("Nas�ls�n");
	}
	
	//Parametresiz Faktoriyel Methodu
	public static void parametresizFaktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir say� giriniz : ");
		
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
		System.out.println("Say�lar�n Toplam� : " + (a+b+c));
	}
	
	// Return : Bir fonksiyondan d�nen de�eri ba�ka bir fonksiyonda kullanmak isteyebiliriz, buralarda fonksiyonlar�m�za return anahtar kelimesinin kullan�lmas� gerekiyor.
	//Returnden sonraki hi�bir kod �al��maz!! Return fonksiyonun son i�lemidir. Returnden sonra hi�bir �ey �al��maz.
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
		//System.out.println("��kt� Sonucu : " + returnToplama(1, 2, 3));
		System.out.println("Sonuc : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
	}

}
