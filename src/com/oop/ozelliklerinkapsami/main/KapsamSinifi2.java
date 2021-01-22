package com.oop.ozelliklerinkapsami.main;

public class KapsamSinifi2 {
	private int privateDegisken = 30;
	
	public KapsamSinifi2() {
	}
	public void dahiliSinifKontrol() {
		DahiliSinif d = new DahiliSinif();
		System.out.println("Kontrol ediyor " + d.a);
		//Kapsam sinifi i�erisinde Dahili sinif var ve bunun i�inde a var. yani bu yine asl�nda KapsamSinifi2'nin i�erisinde gibi d���nebiliriz.
		//Ve bu sayedede bir inner clas� i�erisindeki private de�i�kenede direk olarak eri�ebiliyoruz. 
		
	}
	public class DahiliSinif{
		private int privateDegisken = 20;
		private int a = 3;
		public void onileCarp() {
			int privateDegisken = 10;
			for (int i = 1; i < 6; i++) {
				System.out.println(i + " * " + KapsamSinifi2.this.privateDegisken + " = " + (i*KapsamSinifi2.this.privateDegisken));
				
				//KapsamSinifi2.this.privateDegisken -- KapsamSinifi2 nin privateDegiskenini kullanm�� oluyoruz.
				//this.privateDegisken -- DahiliSinif in privateDegiskenini kullanm�� oluyoruz.
			}
		}
	}
}
