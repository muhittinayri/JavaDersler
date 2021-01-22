package com.oop.Inheritance.main;

//Y�netici Class� subclass yani alt classt�r. 
public class Yonetici extends Calisan {
	private int sorumlu_kisi; //Yonetici class�n�n ekstra �zelli�i
	public Yonetici(String isim, int maas, String departman,int sorumlu_kisi) {
		super(isim, maas, departman); //Super anahtar kelimesi ile Superclassdaki constructor�n� kullanmak istedi�imizi belirtiriz.
		this.sorumlu_kisi = sorumlu_kisi;
	} 
	
	public void zam_yap(int zam_miktar�) {
		System.out.println("�al��anlara " + zam_miktar� + " TL zam yap�ld�");
	}
	
	public void bilgilerigoster() {
		/*System.out.println("�sim : " + getIsim());
		System.out.println("Maas : " + getMaas());
		System.out.println("Departman : " + getDepartman());*/
		
		super.bilgilerigoster();		// Super classtaki methodu �a��r�r !
		System.out.println("Sorumlu ki�i say�s� : " + this.sorumlu_kisi);
	}
	
}
