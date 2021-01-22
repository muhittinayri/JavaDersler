package com.oop.interfaces.main;

public class MakineMuhendisi implements IMuhendis,ICalisma {

	private boolean askerlik;
	private boolean adli_sicil;

	public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {
		if (askerlik) {
			System.out.println("Askerliði yaptým");
		} else {
			System.out.println("Askerliði yapmadým");
		}
	}

	@Override
	public String mezuniyet_ortalamasý(double derece) {
		return "Ortalamam : " + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kaydým vardýr");
		} else {
			System.out.println("Adli sicil kaydým bulunmuyor.");
		}
	}

	@Override
	public void is_tecrubesi(String[] array) {
		if (array.length == 0) {
			System.out.println("Herhangi bir iþ tecrübem bulunmuyor...");
		}else {
			System.out.println("Makine mühendisi olarak þu þirketlerde çalýþtým");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public void referans_getir(String[] array) {
		if (array.length == 0) {
			System.out.println("Herhangi referansým yoktur");
		}else {
			System.out.println("Referanslarým...");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	@Override
	public void calis() {
		System.out.println("Makine mühendisi çalýþýyor...");
	}

}
