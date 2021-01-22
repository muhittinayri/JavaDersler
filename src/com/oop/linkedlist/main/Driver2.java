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
			int karsilastir = iterator.next().compareTo(yeni);  //Ýteratorýn gösterdiði deðerle gönderilen deðeri kýyaslanýr eðer deðerler eþit ise 0 çýkýyor. eðer yeni iterator'ýn gösterdiði deðerden daha büyük ise karsýlastýrýn sonucu -1 çýkar. Eðer yeni iteratorýn gösterdiðinden daha küçük ise karþýlaþtýrýn deðeri sýfýrdan büyük çýkýyor
			if (karsilastir == 0) {
				//Ýki deðer eþit
				System.err.println("Listenizde bu eleman zaten var");
				return; //Return ifadesini sadece metotdumuzu bitirmek için kullanýyoruz.
			}else if (karsilastir < 0) {
				//Yeni deðer iterator.next'den daha büyük
			}else if (karsilastir > 0) {
				iterator.previous();  //iterator bir geri deðere gelicek ve bizde iteratorun geldiði yere ekliyecez
				iterator.add(yeni);
				return;
			}
			
		}
		iterator.add(yeni);
	}
	
	public static void main(String[] args) {
		//Iterator : Linkedlist üzerinde daha kompleks iþlemler yapmak için linkedlist üzerinde gezinmemizi saðlayacaktýr.
		
		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		/*
		gidilecek_yerler.add("Postane");
		gidilecek_yerler.add("Market");
		gidilecek_yerler.add("Okul");
		gidilecek_yerler.add("Kütüphane");
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
