package com.oop.interfaces.main;

public class Driver {
	
	/*
	 * �nterface : �oklu kal�t�m i�leri yapar. 
	 * Javada interfacelerin metotlar�n kod bloklar� yaz�lmaz. bu metotlar� kendi claslar�n i�inde yaz�lmas� gerekiyor. 
	 * Bir s�zle�me g�revi g�r�r interface.
	 * Obje olu�turamay�z.
	 * Kendisinden bir obje olu�turamay�z ancaak bu interface'i implement eden yani bu interface'e uyan claslar�m�za sadece referans olabiliyoruz.
	 * �nterfacelerin i�erisine herhangi bir �zellik bulunam�yor. Sadece final ve static de�i�kenler kullan�l�yor.
	 * bir class birden fazla interface'i implement edebilir, bu �zellik sayesinde �oklu kal�t�ma uyarlam�� oluyoruz.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//IMuhendis muhendis = new PcMuhendisi(false, false); interfacelerden biz herhangi bir obje olu�turam�yoruz ancak onlar�n referanslar�n� onlar� implement eden claslar�n objelerine referans olarak g�sterebiliyoruz
		/*PcMuhendisi muhendis = new PcMuhendisi(false, false);
		muhendis.askerlik_durumu_sorgula();
		muhendis.adli_sicil_sorgula();
		System.out.println(muhendis.mezuniyet_ortalamas�(3.07));
		String[] tecrube = {"Vestel","Havelsan","T�rksat"};
		muhendis.is_tecrubesi(tecrube);*/
		
		MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true, false);
		String[] tecr�be = {};
		String[] referans = {"Muhittin Ayr�", "Ali Ayr�"};
		makineMuhendisi.adli_sicil_sorgula();
		makineMuhendisi.askerlik_durumu_sorgula();
		System.out.println(makineMuhendisi.mezuniyet_ortalamas�(2.37));
		makineMuhendisi.is_tecrubesi(tecr�be);
		makineMuhendisi.referans_getir(referans);
		makineMuhendisi.calis();
	}
}
