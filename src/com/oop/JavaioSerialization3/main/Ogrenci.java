package com.oop.JavaioSerialization3.main;

import java.io.Serializable;


//Clas� Serializable ile i�aretliyoruz.
public class Ogrenci implements Serializable{
	//E�er bir class'a versiyon atamak istenirse versiyon kontrol� atamak istiyorsak serialVersionUID o clas�m�z�n o anki versiyonunu javaya s�ylemek i�in bir de�i�ken
	private static final long serialVersionUID = 1000;
	private String isim;
	private transient int id;  //Bunu sak�n serile�tirme �nemli bir�ey de�ildir! Bu �zellik i�erisine hi�bir de�er eklenmemi� gibi varsay�lan bir de�er ile ba�lar.
	private String bolum;
	private String desler; //yeni eklenecek olan bir de�i�keni eklemek istedi�imizde serialVersionUID'de g�ncellemek gerekmektedir. Aksi takdirde hata verir.
	
	
	//static anahtar kelimesinden dolay� direkt olarak class'a ait bir �zelliktir.
	//static bir alan Ogrenci clas�na ait oldu�u i�in java bunu serile�tirmiyor!
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
		String bilgiler = "��renci ismi : " + isim + "\n��renci Numaras� : " + id + "\n��renci B�l�m : " + bolum;
		return bilgiler;
	}
	
}
