package com.oop.genericsclass.main;

/*
 * Generic : Türden baðýmsýz iþlem yaptýðýmýz metotlar veya classlardýr.
 * Herhangi bir türe baðlý kalmadan bir metodu veya bir clasý direk olarak yazabiliriz 
 * 
 */

public class Driver {
	public static void main(String[] args) {
		
		Character[] char_dizi = {'J','A','V','A'};
		Integer[] integer_dizi = {1,2,3,4,5,6};
		String[] string_dizi = {"Java","Python","C++","PHP"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};

		
		/*
		CharYazdir.yazdir(char_dizi);
		System.out.println("*************");
		IntegerYazdir.yazdir(integer_dizi);
		System.out.println("*************");
		StringYazdir.yazdir(string_dizi);
		System.out.println("*************");
		OgrenciYazdir.yazdir(ogrenci_dizi);
		*/
		
		
		YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
		YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
		YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
		YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
		
		yazdir_char.yazdir(char_dizi);
		System.out.println("*************");
		yazdir_string.yazdir(string_dizi);
		System.out.println("*************");
		yazdir_integer.yazdir(integer_dizi);
		System.out.println("*************");
		yazdir_ogrenci.yazdir(ogrenci_dizi);
		
	}
}	
