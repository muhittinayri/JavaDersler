package com.oop.Inheritance.main;

/*
 * Inheritance : Kal�t�m veya Miras alma anlam�na gelir. Bir s�n�f�n ba�ka bir s�n�fdan �zelliklerini ve metotlar�n� miras almas�d�r.
 * 				 is a ili�kisi bulunur. yani �rne�in y�netici clas�n� �al��an s�n�f�ndan t�ertti�imiz zaman asl�nda is a ili�kisi bulunuyor
 * 				 is a = yani y�neticide bir �al��and�r anlam�na geliyor.
 */

public class Driver {
	public static void main(String[] args) {
		Yonetici yonetici1 = new Yonetici("Muhittin", 1500, "Yaz�l�m",5);
		yonetici1.bilgilerigoster();
//		yonetici1.zam_yap(500);
	}
}
