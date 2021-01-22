package com.oop.encapsulation;

//Doðalgaz Abonesi
//Encapsulation prensibine aykýrý bir yazým

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
						"Bakiyeniz bitmiþtir. Lütfen en yakýn abone merkezine giderek kredi yükleyin Kredi Limiti = 120 TL");
			} else {
				System.out.println("Yeni bakiye : " + bakiye);
			}
		}

	}

	public void bakiye_ogren() {
		System.out.println("Bakiye : " + bakiye);
	}
}
