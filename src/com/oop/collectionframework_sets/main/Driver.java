package com.oop.collectionframework_sets.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set Interface ---> HashSet, LinkedHashSet, TreeSet
 * 
 * Set interface ile List interface'in farký
 * List interface'i implemente eden classlar bir elementten birden fazla depolayabilirken,
 * Set interface'i implemente eden classlar bir elementten sadece bir tane depolarlar.
 * 
 * 
 * 
 * HashSet Sýnýfý : HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
 * 
 * 1. HashSet elementleri "hashing" yani hash table mekanizmasýna uygun bir biçimde depolarlar.
 * (Her element belli bir key'e göre depolanýr.)
 * 
 * 2. HashSet bir element'i sadece bir defa depolar. (Set interface)
 * 
 * 3. Elementlerin ekleme sýrasýna göre depolamaz.
 * 
 * 
 * 
 * LinkedHashSet Sýnýf : LinkHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
 * 
 * 1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranýr
 * 
 * 2. HashSette olduðu gibi bir elementi sadece bir defa depolar. (Set Interface)
 * 
 * 3. Elementleri ekleme sýrasýna göre depolar.
 * 
 * 
 * 
 * TreeSet Sýnýfý : TreeSet sýnýfý NavigableSet interface'ini implemente eder ve AbstractSet sýnýfýndan miras alýr.
 * NavigableSet interface'i de SýrtedSet interfacesinden miras alýr.
 * 
 * 1. Elementleri depolamak için Tree yani Aðaç yapýsýný kullanýr.
 * 
 * 2. Elementleri alfabetik olarak sýralarç
 * 
 * 
 * *----------------------------------------*
 * 
 * HashSet vs LinkedHashSet vs TreeSet
 * 
 * HashSet, Hash Table mekanizmasýný uyguladýðý için elementler sýralý deðildir. Ekleme, Çýkarma ve Arama metotlarý sabit zamanda (Time Complexity : o(1)) çalýþýr
 * 
 * 
 * TreeSet, elementleri tree yapýsýna yani aðaç yapýsýna uygun depolar. Ekleme, çýkarma ve arama metodlarý O (log(n)) complexitysi ile çalýþýr.
 * 
 * 
 * LinkedHashSet sýnýfý hashtable ile linked list yapýsýný kullanarak elementleri depolar. Bu yüzden elementler ekleme sýrasýna göre depolanýr. Ekleme, Çýkarma ve arama metodlarý sabit zamanda (Time Complexity : O(1)) çalýþýr
 * 
 * 
 * 
 */

public class Driver {
	public static void main(String[] args) {
		/*
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		//HashSet
		set1.add("Java");
		set1.add("Python");
		set1.add("C++");
		set1.add("JavaScript");
		set1.add("PHP");
		
		//LinkedHashSet
		set2.add("Java");
		set2.add("Python");
		set2.add("C++");
		set2.add("JavaScript");
		set2.add("PHP");
		
		//TreeSet
		set3.add("Java");
		set3.add("Python");
		set3.add("C++");
		set3.add("JavaScript");
		set3.add("PHP");
		//set3.add("PHP");  Eklenmez sadece bir tane depolar
		
		//Karýþýk olarak ekrana yazdýrýr
		System.out.println("*****************************************************");
		System.out.println("HashSet");
		System.out.println("*****************************************************");
		for (String s : set1) {
			System.out.println(s);
		}
		
		//Ekleme Sýrasýna göre yazar
		System.out.println("*****************************************************");
		System.out.println("LinkedHashSet");
		System.out.println("*****************************************************");
		for (String s : set2) {
			System.out.println(s);
		}
		
		
		//Alfabetik olarak sýralar
		System.out.println("*****************************************************");
		System.out.println("TreeSet");
		System.out.println("*****************************************************");
		for (String s : set3) {
			System.out.println(s);
		}
		
		*/
		
		
		
		//Fark Kümesi
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("Java");
		set1.add("C++");
		set1.add("Python");
		set1.add("JavaScript");
		set1.add("PHP");
		
		
		set2.add("Go");
		set2.add("Java");
		set2.add("CSS");
		
	/*	Set<String> fark = new HashSet<String>(set2);
		System.out.println(fark.removeAll(set1));  //Hangi karakterler farklý sorgulanýyor. Boþ küme deðilse true - boþ ise false
		
		System.out.println(fark);  //Farký yazdýrýr.*/
		
		
		Set<String> kesisim = new HashSet<String>(set2);
		kesisim.retainAll(set1);  //Kesisim kümesi var mý kontorl eder. Eðer varsa true - yoksa false döner
		
		System.out.println(kesisim);
		
		
		/*
		 * Sýralý deðer eklediðimizde TreeSet daha hýzlý 
		 * Karýþýk deðerler eklediðimizde HashSet daha hýzlý çalýþýr.
		 * 		
		 */
	}
}
