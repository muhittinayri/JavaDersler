package com.oop.anoniminnerclass.main;

/*
 * Anonim inner class: interface veya bir tane abstract class var ise ve bunlardan Herhangi bir class türetmeden biz direk obje oluþturmak istiyor isek anonim inner classlarý kullanýyoruz demektir.
 * Bir interface'in veya abstract class'ýn direk metotlarýný implement ederek direk o objeyi herhangi bir class tanýmlamasýna gerek kalmadan direk olarak kullanabiliyoruz.
 * 
 */

public class Driver {
	public static void main(String[] args) {
		
		IOgrenci ogrenci = new IOgrenci() {
			
			@Override
			public void derse_gir() {
				System.out.println("Öðrenci derse girdi");
			}
			
			@Override
			public void ders_calis() {
				System.out.println("Öðrenci ders çalýþýyor");
			}
		};
		
		ogrenci.ders_calis();
		ogrenci.derse_gir();
		
		System.out.println("************************************");
		
		AOgrenci ogrenci2 = new AOgrenci("Muhittin",983) {
			
			@Override
			void kayit_yaptir() {
				System.out.println("Kayit yapiliyor..." + " Ýsim : " + getIsim() + " - Numara : " + getNumara());
				
			}
		};
		
		ogrenci2.kayit_yaptir();
		ogrenci2.selamla();
		
	}
	
	public static abstract class AOgrenci{
		
		private String isim;
		private int numara;
		
		public AOgrenci(String isim, int numara) {
			this.isim = isim;
			this.numara = numara;
		}
		
		
		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getNumara() {
			return numara;
		}

		public void setNumara(int numara) {
			this.numara = numara;
		}

		abstract void kayit_yaptir();
		public void selamla() {
			System.out.println("Selamlar..");
		}
	}
	
	public interface IOgrenci{
		void ders_calis();
		void derse_gir();
		
	}
	
}
