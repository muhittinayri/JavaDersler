package com.oop.genericmetot.main;

import com.oop.genericsclass.main.Ogrenci;

public class Driver {
	public static void main(String[] args) {

		Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
		Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
		
		Sayisal birinci = birinci(sayisal1, sayisal2);
		
		
		EsitAgirlik esitAgirlik1 = new EsitAgirlik(30, 20, 40, 2);
		EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);
		
		EsitAgirlik birinci2 = birinci(esitAgirlik1,esitAgirlik2);
		
		
		System.out.println("Birinci öðrencinin puaný : " + birinci.puan_hesapla());
		System.out.println("Birinci öðrencinin puaný : " + birinci2.puan_hesapla());
		
		/*
		 * Character[] char_dizi = {'J','A','V','A'}; Integer[] integer_dizi =
		 * {1,2,3,4,5,6}; String[] string_dizi = {"Java","Python","C++","PHP"};
		 * Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new
		 * Ogrenci("Merve")};
		 * 
		 * yazdir(char_dizi); yazdir(string_dizi); yazdir(integer_dizi);
		 * yazdir(ogrenci_dizi);
		 * 
		 * 
		 * }
		 * 
		 * //Generic metot oluþturma public static <E> void yazdir(E[] dizi) { for (E e
		 * : dizi) { System.out.println(e); }
		 */

	}
	//<E extends Aday> : Gönderilen veri tipleri sadece Aday class'ýný extends eden veri tiplerini göndereceðim anlamýna geliyor. 
	public static <E extends Aday> E birinci(E e1, E e2) {
		if (e1.puan_hesapla() > e2.puan_hesapla()) {
			return e1;
		}else {
			return e2;
		}
	}

}
