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
			System.out.println("Askerli�i yapt�m");
		} else {
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
		} else {
			System.out.println("Adli sicil kayd�m bulunmuyor.");
		}
	}

	@Override
	public void is_tecrubesi(String[] array) {
		if (array.length == 0) {
			System.out.println("Herhangi bir i� tecr�bem bulunmuyor...");
		}else {
			System.out.println("Makine m�hendisi olarak �u �irketlerde �al��t�m");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
	
	public void referans_getir(String[] array) {
		if (array.length == 0) {
			System.out.println("Herhangi referans�m yoktur");
		}else {
			System.out.println("Referanslar�m...");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	@Override
	public void calis() {
		System.out.println("Makine m�hendisi �al���yor...");
	}

}
