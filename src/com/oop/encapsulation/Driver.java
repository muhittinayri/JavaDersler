package com.oop.encapsulation;

public class Driver {
	/*
	 * Encapsulation : Bir s�n�f�n detaylar�n� �zelliklerini ba�ka bir s�n�fa gizlemektir. Ba�ka bir s�n�fdan gizlemek
	 * 				   Bir s�n�f� public yapmak yerine private yap�yoruz. Bu bir encapsulationun �zetidir.
	 * 				   Yani ba�ka bir s�n�fa kendi s�n�f�m�z�n �zelliklerini kaps�ll�yoruz yani detaylar� gizliyoruz
	 * 				   
	 */
		
	public static void main(String[] args) {
		/*Abone abone = new Abone();
		abone.isim = "Muhittin";
		abone.bakiye = 200;
		abone.sehir = "Ankara";
		
		abone.dogalgaz_kullan(200);*/
		
		
		GelismisAbone abone = new GelismisAbone("Muhittin AYRI", 200, "Ankara");
		abone.bakiye_ogren();  //bakiyeye 120  �zeri bir de�er girilse bile �st limit olan 120yi kadar s�n�rlar.
	}
	
}
