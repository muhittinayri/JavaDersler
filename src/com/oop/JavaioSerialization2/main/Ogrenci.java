package com.oop.JavaioSerialization2.main;

import java.io.Serializable;


//Clasý Serializable ile iþaretliyoruz.
public class Ogrenci implements Serializable{
	//Eðer bir class'a versiyon atamak istenirse versiyon kontrolü atamak istiyorsak serialVersionUID o clasýmýzýn o anki versiyonunu javaya söylemek için bir deðiþken
	private static final long serialVersionUID = 1000;
	private String isim;
	private int id;
	private String bolum;
	private String desler; //yeni eklenecek olan bir deðiþkeni eklemek istediðimizde serialVersionUID'de güncellemek gerekmektedir. Aksi takdirde hata verir.
	
	
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
