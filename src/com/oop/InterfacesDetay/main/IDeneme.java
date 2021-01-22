package com.oop.InterfacesDetay.main;

/*
 * interfacelerde bir özellik eklemek istersek mutlaka public ile baþlamasý gerekiyor. 
 * Mutlaka özellik eklemek için özelliðin deðerini tanýmlandýðý yerde verilmesi gerekiyor.
 * 
 */

public interface IDeneme {
	//interfaceler'de Java otomatik olarak static'e çevirmektedir.
	public int a = 4;
	
	public int b = 5;
	
	public static String deneme = "Deneme";
	
	public final int c = 6;
	
	
	//interfacelerde metot tanýmlamak için mutlaka static anahtar kelimesi olmak zorundadýr.
	public static void deneme() {
		System.out.println("Deneme");
	}
	
}
