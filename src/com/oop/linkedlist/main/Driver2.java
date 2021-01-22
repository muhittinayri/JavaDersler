package com.oop.linkedlist.main;

import java.util.LinkedList;
import java.util.ListIterator;

public class Driver2 {
	
	public static void ekrana_yazdir(LinkedList<String> linkedlist) {
		
		/*for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}*/
		
		/*for (String s : linkedlist) {
			System.out.println(s);
		}*/
		
		ListIterator<String> iterator = linkedlist.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
	public static void sirali_ekle(LinkedList<String> gidilecek_yerler,String yeni) {
		ListIterator<String> iterator = gidilecek_yerler.listIterator();
		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni);  //�terator�n g�sterdi�i de�erle g�nderilen de�eri k�yaslan�r e�er de�erler e�it ise 0 ��k�yor. e�er yeni iterator'�n g�sterdi�i de�erden daha b�y�k ise kars�last�r�n sonucu -1 ��kar. E�er yeni iterator�n g�sterdi�inden daha k���k ise kar��la�t�r�n de�eri s�f�rdan b�y�k ��k�yor
			if (karsilastir == 0) {
				//�ki de�er e�it
				System.err.println("Listenizde bu eleman zaten var");
				return; //Return ifadesini sadece metotdumuzu bitirmek i�in kullan�yoruz.
			}else if (karsilastir < 0) {
				//Yeni de�er iterator.next'den daha b�y�k
			}else if (karsilastir > 0) {
				iterator.previous();  //iterator bir geri de�ere gelicek ve bizde iteratorun geldi�i yere ekliyecez
				iterator.add(yeni);
				return;
			}
			
		}
		iterator.add(yeni);
	}
	
	public static void main(String[] args) {
		//Iterator : Linkedlist �zerinde daha kompleks i�lemler yapmak i�in linkedlist �zerinde gezinmemizi sa�layacakt�r.
		
		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		/*
		gidilecek_yerler.add("Postane");
		gidilecek_yerler.add("Market");
		gidilecek_yerler.add("Okul");
		gidilecek_yerler.add("K�t�phane");
		gidilecek_yerler.add("Spor Salonu");
		gidilecek_yerler.add("Ev");
		
		ekrana_yazdir(gidilecek_yerler);
		
		System.out.println("-------------------------");
		
		//gidilecek_yerler.add(4,"AVM");
		
		gidilecek_yerler.remove(3);
		
		ekrana_yazdir(gidilecek_yerler);
		*/
		
		sirali_ekle(gidilecek_yerler, "Postane");
		sirali_ekle(gidilecek_yerler, "Market");
		sirali_ekle(gidilecek_yerler, "Ev");
		
		ekrana_yazdir(gidilecek_yerler);
		
		
	}
}
