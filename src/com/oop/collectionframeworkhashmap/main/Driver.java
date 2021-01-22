package com.oop.collectionframeworkhashmap.main;

import java.util.HashMap;
import java.util.Map;

/*
 * Hashmap Sýnýfý :
 * 1.Deðerleri Key(Anahtar) ve Value(Deðer) olarak depolar. Her key'e karþýlýk gelen bir tane deðer bulunur.
 * 
 * 2.Bir anahtar sadece bir kez varolabilir. Ancak bir deðer birden fazla olabilir.
 * 
 * 3.Elementleri týpký HashSet gibi ekleme sýrasýna göre depolamaz (HashSet gibi)
 */

public class Driver {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Java");
		hashMap.put(30, "Python");
		hashMap.put(50, "PHP");
		hashMap.put(20, "Php");
		
		/*
		//hashMap.put(50, "JavaScript"); 50 keye sahip olanýn üzerine yazar
		
		System.out.println(hashMap);
		
		//System.out.println(hashMap.get(50));  50 keyine sahip deðeri getirir.
		
		*/
		
		for(Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Anahtar : " + entry.getKey() + " -----> Deðer : " + entry.getValue() );
		}
		
	}
}
