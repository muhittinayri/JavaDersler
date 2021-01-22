package com.oop.Inheritance.main;

//Yönetici Classý subclass yani alt classtýr. 
public class Yonetici extends Calisan {
	private int sorumlu_kisi; //Yonetici classýnýn ekstra özelliði
	public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
		super(isim, maas, departman); //Super anahtar kelimesi ile Superclassdaki constructorýný kullanmak istediðimizi belirtiriz.
		this.sorumlu_kisi = sorumlu_kisi;
	} 
	
	public void zam_yap(int zam_miktarý) {
		System.out.println("Çalýþanlara " + zam_miktarý + " TL zam yapýldý");
	}
	
	public void bilgilerigoster() {
		/*System.out.println("Ýsim : " + getIsim());
		System.out.println("Maas : " + getMaas());
		System.out.println("Departman : " + getDepartman());*/
		
		super.bilgilerigoster();		// Super classtaki methodu çaðýrýr !
		System.out.println("Sorumlu kiþi sayýsý : " + this.sorumlu_kisi);
	}
	
}
