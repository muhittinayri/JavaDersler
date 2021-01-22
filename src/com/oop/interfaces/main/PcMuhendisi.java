package com.oop.interfaces.main;

//�nterface'i implements anahtar kelimesi ile �a��r�yoruz.

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
			System.out.println("Askerli�i yapt�m");
		}else {
			System.out.println("Askerli�i yapmad�m");
		}
	}

	@Override
	public String mezuniyet_ortalamas�(double derece) {
		return "Ortalamam : " + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kayd�m vard�r");
		}else {
			System.out.println("Adli sicil kayd�m bulunmuyor.");
		}
		
	}

	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println("Bilgisayar M�hendisi olarak �u �irketlerde �al��t�m.");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
