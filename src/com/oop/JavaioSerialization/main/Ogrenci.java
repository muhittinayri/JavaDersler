package com.oop.JavaioSerialization.main;

import java.io.Serializable;


//Clas� Serializable ile i�aretliyoruz.
public class Ogrenci implements Serializable{
	//E�er bir class'a versiyon atamak istenirse versiyon kontrol� atamak istiyorsak serialVersionUID o clas�m�z�n o anki versiyonunu javaya s�ylemek i�in bir de�i�ken
	private static final long serialVersionUID = 1000;
	private String isim;
	private int id;
	private String bolum;
	private String desler; //yeni eklenecek olan bir de�i�keni eklemek istedi�imizde serialVersionUID'de g�ncellemek gerekmektedir. Aksi takdirde hata verir.
	
	
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
