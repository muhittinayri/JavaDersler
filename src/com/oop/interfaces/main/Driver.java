package com.oop.interfaces.main;

public class Driver {
	
	/*
	 * Ýnterface : Çoklu kalýtým iþleri yapar. 
	 * Javada interfacelerin metotlarýn kod bloklarý yazýlmaz. bu metotlarý kendi claslarýn içinde yazýlmasý gerekiyor. 
	 * Bir sözleþme görevi görür interface.
	 * Obje oluþturamayýz.
	 * Kendisinden bir obje oluþturamayýz ancaak bu interface'i implement eden yani bu interface'e uyan claslarýmýza sadece referans olabiliyoruz.
	 * Ýnterfacelerin içerisine herhangi bir özellik bulunamýyor. Sadece final ve static deðiþkenler kullanýlýyor.
	 * bir class birden fazla interface'i implement edebilir, bu özellik sayesinde çoklu kalýtýma uyarlamýþ oluyoruz.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//IMuhendis muhendis = new PcMuhendisi(false, false); interfacelerden biz herhangi bir obje oluþturamýyoruz ancak onlarýn referanslarýný onlarý implement eden claslarýn objelerine referans olarak gösterebiliyoruz
		/*PcMuhendisi muhendis = new PcMuhendisi(false, false);
		muhendis.askerlik_durumu_sorgula();
		muhendis.adli_sicil_sorgula();
		System.out.println(muhendis.mezuniyet_ortalamasý(3.07));
		String[] tecrube = {"Vestel","Havelsan","Türksat"};
		muhendis.is_tecrubesi(tecrube);*/
		
		MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true, false);
		String[] tecrübe = {};
		String[] referans = {"Muhittin Ayrý", "Ali Ayrý"};
		makineMuhendisi.adli_sicil_sorgula();
		makineMuhendisi.askerlik_durumu_sorgula();
		System.out.println(makineMuhendisi.mezuniyet_ortalamasý(2.37));
		makineMuhendisi.is_tecrubesi(tecrübe);
		makineMuhendisi.referans_getir(referans);
		makineMuhendisi.calis();
	}
}
