package com.oop.ozelliklerinkapsami.main;

public class KapsamSinifi2 {
	private int privateDegisken = 30;
	
	public KapsamSinifi2() {
	}
	public void dahiliSinifKontrol() {
		DahiliSinif d = new DahiliSinif();
		System.out.println("Kontrol ediyor " + d.a);
		//Kapsam sinifi içerisinde Dahili sinif var ve bunun içinde a var. yani bu yine aslında KapsamSinifi2'nin içerisinde gibi düşünebiliriz.
		//Ve bu sayedede bir inner clası içerisindeki private değişkenede direk olarak erişebiliyoruz. 
		
	}
	public class DahiliSinif{
		private int privateDegisken = 20;
		private int a = 3;
		public void onileCarp() {
			int privateDegisken = 10;
			for (int i = 1; i < 6; i++) {
				System.out.println(i + " * " + KapsamSinifi2.this.privateDegisken + " = " + (i*KapsamSinifi2.this.privateDegisken));
				
				//KapsamSinifi2.this.privateDegisken -- KapsamSinifi2 nin privateDegiskenini kullanmış oluyoruz.
				//this.privateDegisken -- DahiliSinif in privateDegiskenini kullanmış oluyoruz.
			}
		}
	}
}
