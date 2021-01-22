package com.oop.collectionframeworkhashmap.main;

import java.util.HashMap;
import java.util.Map;

/*
 * Hashmap S�n�f� :
 * 1.De�erleri Key(Anahtar) ve Value(De�er) olarak depolar. Her key'e kar��l�k gelen bir tane de�er bulunur.
 * 
 * 2.Bir anahtar sadece bir kez varolabilir. Ancak bir de�er birden fazla olabilir.
 * 
 * 3.Elementleri t�pk� HashSet gibi ekleme s�ras�na g�re depolamaz (HashSet gibi)
 */

public class Driver {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Java");
		hashMap.put(30, "Python");
		hashMap.put(50, "PHP");
		hashMap.put(20, "Php");
		
		/*
		//hashMap.put(50, "JavaScript"); 50 keye sahip olan�n �zerine yazar
		
		System.out.println(hashMap);
		
		//System.out.println(hashMap.get(50));  50 keyine sahip de�eri getirir.
		
		*/
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar : " + entry.getKey() + " -----> De�er : " + entry.getValue() );
		}
		
	}
}
