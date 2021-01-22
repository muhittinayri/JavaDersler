package com.oop.InterfacesDetay.main;

/*
 * interfacelerde bir �zellik eklemek istersek mutlaka public ile ba�lamas� gerekiyor. 
 * Mutlaka �zellik eklemek i�in �zelli�in de�erini tan�mland��� yerde verilmesi gerekiyor.
 * 
 */

public interface IDeneme {
	//interfaceler'de Java otomatik olarak static'e �evirmektedir.
	public int a = 4;
	
	public int b = 5;
	
	public static String deneme = "Deneme";
	
	public final int c = 6;
	
	
	//interfacelerde metot tan�mlamak i�in mutlaka static anahtar kelimesi olmak zorundad�r.
	public static void deneme() {
		System.out.println("Deneme");
	}
	
}
