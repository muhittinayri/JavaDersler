package com.oop.interfaces.main;

//Ýnterface'i implements anahtar kelimesi ile çaðýrýyoruz.

public class PcMuhendisi implements IMuhendis{

	private boolean askerlik;
	private boolean adli_sicil;
	
	
	
	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {
		if (askerlik) {
			System.out.println("Askerliði yaptým");
		}else {
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
		}else {
			System.out.println("Adli sicil kaydým bulunmuyor.");
		}
		
	}

	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println("Bilgisayar Mühendisi olarak þu þirketlerde çalýþtým.");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
