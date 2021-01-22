package com.oop.hashpmapLinkedHashMapandTreemap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Hashmap'de bir tane key(anahtar) veriyoruz. Ona kar��l�k gelen bir tane de�er veriyoruz. Kar���k bir bi�imde depolan�yorlar.
 * 
 * LinkHashMap'de T�pk� LinkHashSet'de oldu�u gibi ekleme s�ras�na g�re key'leri depoluyoruz. Nas�l eklediysek o �ekilde ekrana bast�r�yoruz.
 * 
 * TreeMap'de ayn� TreeSet gibi bu sefer objelerimiz keylere g�re s�ralanm�� oluyor yani ne kadar �ok key verirsek verelim o keyler s�ralanm�� bir �ekilde
 * k���kten b�y��e do�ru s�ralan�yorlar
 */

public class Driver {
	public static void yazdir(Map<Integer, String> map) {
		map.put(10, "C++");
		map.put(5, "Java");
		map.put(1, "Python");
		map.put(2, "Php");
		map.put(100,"C");
		/*
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " --> Deger : " + entry.getValue());
		}
		*/
		//System.out.println(map.keySet()); Sadece key'ler yaz�l�r
		
		/*
		for(Integer key : map.keySet()) {
			System.out.println("Key : " + key + " Value : " + map.get(key));
		}
		*/
		
		
		//Sadece De�erler gelir
		Collection<String> values = map.values();
		for (String s : values) {
			System.out.println("De�er : " + s);
		}
		
	}
	
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
		System.out.println("*****************************************");
		yazdir(hashmap);
		System.out.println("*****************************************");
		yazdir(linkedhashmap);
		System.out.println("*****************************************");
		yazdir(treemap);
	}
}
