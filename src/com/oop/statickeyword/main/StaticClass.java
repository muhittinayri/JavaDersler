package com.oop.statickeyword.main;

public class StaticClass {
	public static int obje_sayisi = 0;
	private static String isim;  //private String isim; - Static olan bir alanda static olmayan bir alaný kullanamayýz...!
	
	public StaticClass(String isim) {
		this.isim = isim;
		obje_sayisi++;
	}
	
	public static String getIsim() {
		return isim;  
	}
}
