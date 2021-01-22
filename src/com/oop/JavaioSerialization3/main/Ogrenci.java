package com.oop.JavaioSerialization3.main;

import java.io.Serializable;


//Clasý Serializable ile iþaretliyoruz.
public class Ogrenci implements Serializable{
	//Eðer bir class'a versiyon atamak istenirse versiyon kontrolü atamak istiyorsak serialVersionUID o clasýmýzýn o anki versiyonunu javaya söylemek için bir deðiþken
	private static final long serialVersionUID = 1000;
	private String isim;
	private transient int id;  //Bunu sakýn serileþtirme önemli birþey deðildir! Bu özellik içerisine hiçbir deðer eklenmemiþ gibi varsayýlan bir deðer ile baþlar.
	private String bolum;
	private String desler; //yeni eklenecek olan bir deðiþkeni eklemek istediðimizde serialVersionUID'de güncellemek gerekmektedir. Aksi takdirde hata verir.
	
	
	//static anahtar kelimesinden dolayý direkt olarak class'a ait bir özelliktir.
	//static bir alan Ogrenci clasýna ait olduðu için java bunu serileþtirmiyor!
	private static int ogrenci_sayisi = 0;
	

	/**
	 * @return the ogrenci_sayisi
	 */
	public static int getOgrenci_sayisi() {
		return ogrenci_sayisi;
	}

	/**
	 * @param ogrenci_sayisi the ogrenci_sayisi to set
	 */
	
	public static void setOgrenci_sayisi(int ogrenci_sayisi) {
		Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
	}

	public Ogrenci(String isim, int id, String bolum) {
		this.isim = isim;
		this.id = id;
		this.bolum = bolum;
	}
	
	@Override
	public String toString() {
		String bilgiler = "Öðrenci ismi : " + isim + "\nÖðrenci Numarasý : " + id + "\nÖðrenci Bölüm : " + bolum;
		return bilgiler;
	}
	
}
