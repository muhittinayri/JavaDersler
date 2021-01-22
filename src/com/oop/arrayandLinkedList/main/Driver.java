package com.oop.arrayandLinkedList.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Driver {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		zamanHesapla("LinkedList", linkedList);
		zamanHesapla("ArrayList", arrayList);
		
		
	}
	
	public static void zamanHesapla(String veri_tipi, List<Integer> list) {
		// Listin sonuna deðer ekleme
		long baslangic;
		long bitis;
		baslangic = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			list.add(i);
			//list.add(0,i); 0. indekse veri atmak istersek Linkedlist Arrayliste göre daha hýzlý çalýþýr.
		}
		bitis = System.currentTimeMillis();
		
		System.out.println(veri_tipi + " Ekleme süresi " + (bitis - baslangic) + " ms");
	}
}
