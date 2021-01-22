package com.oop.Inheritance.main;

/*
 * Inheritance : Kalýtým veya Miras alma anlamýna gelir. Bir sýnýfýn baþka bir sýnýfdan özelliklerini ve metotlarýný miras almasýdýr.
 * 				 is a iliþkisi bulunur. yani örneðin yönetici clasýný çalýþan sýnýfýndan tüerttiðimiz zaman aslýnda is a iliþkisi bulunuyor
 * 				 is a = yani yöneticide bir çalýþandýr anlamýna geliyor.
 */

public class Driver {
	public static void main(String[] args) {
		Yonetici yonetici1 = new Yonetici("Muhittin", 1500, "Yazýlým",5);
		yonetici1.bilgilerigoster();
//		yonetici1.zam_yap(500);
	}
}
