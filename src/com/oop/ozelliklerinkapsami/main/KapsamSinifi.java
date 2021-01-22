package com.oop.ozelliklerinkapsami.main;

public class KapsamSinifi {
	private int privateDegisken = 30;
	
	public KapsamSinifi() {
		System.out.println("privateDeğişken =" + privateDegisken);
	}
	
	public void onileCarp() {
		int privateDegisken = 10;
		for (int i = 1; i < 6; i++) {
			System.out.println(i + "*" + this.privateDegisken + "=" + (i*this.privateDegisken));  //this anahtar kelimesi ile classın özelliği olan private değişkeni kullanmak istediğimizi söylüyoruz.
			
		}
	}
}