package com.oop.hashpmapLinkedHashMapandTreemap.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Hashmap'de bir tane key(anahtar) veriyoruz. Ona karþýlýk gelen bir tane deðer veriyoruz. Karýþýk bir biçimde depolanýyorlar.
 * 
 * LinkHashMap'de Týpký LinkHashSet'de olduðu gibi ekleme sýrasýna göre key'leri depoluyoruz. Nasýl eklediysek o þekilde ekrana bastýrýyoruz.
 * 
 * TreeMap'de ayný TreeSet gibi bu sefer objelerimiz keylere göre sýralanmýþ oluyor yani ne kadar çok key verirsek verelim o keyler sýralanmýþ bir þekilde
 * küçükten büyüðe doðru sýralanýyorlar
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
		//System.out.println(map.keySet()); Sadece key'ler yazýlýr
		
		/*
		for(Integer key : map.keySet()) {
			System.out.println("Key : " + key + " Value : " + map.get(key));
		}
		*/
		
		
		//Sadece Deðerler gelir
		Collection<String> values = map.values();
		for (String s : values) {
			System.out.println("Deðer : " + s);
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
