package com.oop.collectionframework_sets.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set Interface ---> HashSet, LinkedHashSet, TreeSet
 * 
 * Set interface ile List interface'in fark�
 * List interface'i implemente eden classlar bir elementten birden fazla depolayabilirken,
 * Set interface'i implemente eden classlar bir elementten sadece bir tane depolarlar.
 * 
 * 
 * 
 * HashSet S�n�f� : HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
 * 
 * 1. HashSet elementleri "hashing" yani hash table mekanizmas�na uygun bir bi�imde depolarlar.
 * (Her element belli bir key'e g�re depolan�r.)
 * 
 * 2. HashSet bir element'i sadece bir defa depolar. (Set interface)
 * 
 * 3. Elementlerin ekleme s�ras�na g�re depolamaz.
 * 
 * 
 * 
 * LinkedHashSet S�n�f : LinkHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable
 * 
 * 1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davran�r
 * 
 * 2. HashSette oldu�u gibi bir elementi sadece bir defa depolar. (Set Interface)
 * 
 * 3. Elementleri ekleme s�ras�na g�re depolar.
 * 
 * 
 * 
 * TreeSet S�n�f� : TreeSet s�n�f� NavigableSet interface'ini implemente eder ve AbstractSet s�n�f�ndan miras al�r.
 * NavigableSet interface'i de S�rtedSet interfacesinden miras al�r.
 * 
 * 1. Elementleri depolamak i�in Tree yani A�a� yap�s�n� kullan�r.
 * 
 * 2. Elementleri alfabetik olarak s�ralar�
 * 
 * 
 * *----------------------------------------*
 * 
 * HashSet vs LinkedHashSet vs TreeSet
 * 
 * HashSet, Hash Table mekanizmas�n� uygulad��� i�in elementler s�ral� de�ildir. Ekleme, ��karma ve Arama metotlar� sabit zamanda (Time Complexity : o(1)) �al���r
 * 
 * 
 * TreeSet, elementleri tree yap�s�na yani a�a� yap�s�na uygun depolar. Ekleme, ��karma ve arama metodlar� O (log(n)) complexitysi ile �al���r.
 * 
 * 
 * LinkedHashSet s�n�f� hashtable ile linked list yap�s�n� kullanarak elementleri depolar. Bu y�zden elementler ekleme s�ras�na g�re depolan�r. Ekleme, ��karma ve arama metodlar� sabit zamanda (Time Complexity : O(1)) �al���r
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
		
		//Kar���k olarak ekrana yazd�r�r
		System.out.println("*****************************************************");
		System.out.println("HashSet");
		System.out.println("*****************************************************");
		for (String s : set1) {
			System.out.println(s);
		}
		
		//Ekleme S�ras�na g�re yazar
		System.out.println("*****************************************************");
		System.out.println("LinkedHashSet");
		System.out.println("*****************************************************");
		for (String s : set2) {
			System.out.println(s);
		}
		
		
		//Alfabetik olarak s�ralar
		System.out.println("*****************************************************");
		System.out.println("TreeSet");
		System.out.println("*****************************************************");
		for (String s : set3) {
			System.out.println(s);
		}
		
		*/
		
		
		
		//Fark K�mesi
		
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
		System.out.println(fark.removeAll(set1));  //Hangi karakterler farkl� sorgulan�yor. Bo� k�me de�ilse true - bo� ise false
		
		System.out.println(fark);  //Fark� yazd�r�r.*/
		
		
		Set<String> kesisim = new HashSet<String>(set2);
		kesisim.retainAll(set1);  //Kesisim k�mesi var m� kontorl eder. E�er varsa true - yoksa false d�ner
		
		System.out.println(kesisim);
		
		
		/*
		 * S�ral� de�er ekledi�imizde TreeSet daha h�zl� 
		 * Kar���k de�erler ekledi�imizde HashSet daha h�zl� �al���r.
		 * 		
		 */
	}
}
