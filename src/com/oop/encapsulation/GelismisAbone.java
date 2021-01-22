package com.oop.encapsulation;
//Encapsulation prensibine uyar!
//herhangi bir alanın ismini değiştirsek sadece kendi clasımızın ismini değiştirmemiz yeterlidir.
public class GelismisAbone {
	private String isim;
	private int bakiye = 120; //Bakiye değerini verilmez ise 120'den başlayacak. Yani her objemizin ilk bakiye değeri 120.
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
						"Bakiyeniz bitmiştir. Lütfen en yakın abone merkezine giderek kredi yükleyin Kredi Limiti = 120 TL");
			} else {
				System.out.println("Yeni bakiye : " + bakiye);
			}
		}

	}

	public void bakiye_ogren() {
		System.out.println("Bakiye : " + bakiye);
	}
	
	
}
