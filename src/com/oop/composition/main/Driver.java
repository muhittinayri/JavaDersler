package com.oop.composition.main;

public class Driver {
	public static void main(String[] args) {
		//Composition da HAS-A iliþkisi vardýr. 
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VS197DE", "Asus", "18.5", resolution);
		Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
		Anakart anakart = new Anakart("B250 Pro", "Asus", 10, "Windows-10");
		
		Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
		bilgisayar.getKasa().bilgisayarý_ac();  //Composition - referanslar sayesinde kasa clasýnýn içindeki bilgisayarý aç metotuna eriþebildik.
		bilgisayar.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
	}
}
