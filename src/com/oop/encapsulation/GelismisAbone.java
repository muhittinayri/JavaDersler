package com.oop.encapsulation;
//Encapsulation prensibine uyar!
//herhangi bir alan�n ismini de�i�tirsek sadece kendi clas�m�z�n ismini de�i�tirmemiz yeterlidir.
public class GelismisAbone {
	private String isim;
	private int bakiye = 120; //Bakiye de�erini verilmez ise 120'den ba�layacak. Yani her objemizin ilk bakiye de�eri 120.
	private String sehir;
	
	
	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;
		if (bakiye >= 0 && bakiye <=120) {
			this.bakiye = bakiye;
		}
		this.sehir = sehir;
	}
	
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
