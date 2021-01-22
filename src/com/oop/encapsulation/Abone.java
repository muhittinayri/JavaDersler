package com.oop.encapsulation;

//Do�algaz Abonesi
//Encapsulation prensibine ayk�r� bir yaz�m

public class Abone {

	public String isim;
	public int bakiye;

	public String sehir;

	public void dogalgaz_kullan(int miktar) {
		if ((this.bakiye - miktar) < 0) {
			System.out.println("Yeterli bakiye yok!");
		} else {
			this.bakiye -= miktar;
			if (this.bakiye <= 0) {
				System.out.println(
						"Bakiyeniz bitmi�tir. L�tfen en yak�n abone merkezine giderek kredi y�kleyin Kredi Limiti = 120 TL");
			} else {
				System.out.println("Yeni bakiye : " + bakiye);
			}
		}

	}

	public void bakiye_ogren() {
		System.out.println("Bakiye : " + bakiye);
	}
}
