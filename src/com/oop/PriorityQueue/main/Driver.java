package com.oop.PriorityQueue.main;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue Interface ve PriorityQueue Sýnýfý
 * 
 * PriorityQueue normal Queue mantýðý gibi davranmaz. Elemanlar öncelik sýralarýna göre yüksek öncelik kazanýp 
 * (
 * Integerlarda en yüksek öncelik en küçük sayýda, en düþük öncelik en büyük sayýdadýr
 * Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte,
 * en düþük öncelik alfabetik olarak sözlükte en son gelen stringtedir.
 * 
 * 
 * kuyrukta önlere geçer (Týpký hastanelerdeki acil servisler gibi)
 * add veya offer() metotlarý ---> kuyruða eleman ekler. (Önceden gördüðümüz özellikleri taþýrlar)
 * clear() metodu : Kuyruðu temizler
 * contains(Object o) : o objesi kuyruðun içindeyse true, deðilse false döner.
 * peek() : Kuyruðun baþýndaki elemaný döner. Eðer kuyruk boþsa null referans döner.
 * poll() : Kuyruðun baþýndaki elemaný çýkartýr ve deðer olarak döner. Eðer kuyruk boþsa null referans döner
 * size() : Kuyruðun içindeki eleman sayýsýný döner.
 * 
 */

class Player implements Comparable<Player>{
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	
	
	//Ýdsi küçük olaný daha öncelikli yap
	@Override
	public int compareTo(Player player) {
		if (this.id < player.id) {
			return -1;
		}else if (this.id > player.id) {
			return 1;
		}
		return 0;
	}


	
	//Ekrana yazdýrmak istediðimizde toString metodunu eklememiz gerekiyor
	@Override
	public String toString() {
		return "Player [isim=" + isim + ", id=" + id + "]";
	}
	
	
}



public class Driver {
	public static void main(String[] args) {
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		Queue<Player> queue = new PriorityQueue<Player>();
		queue.offer(new Player("Murat", 5));
		queue.offer(new Player("Mehmet", 1));
		queue.offer(new Player("Oðuz", 100));
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman Çýkarýlýyor : " + queue.poll());
		}
		
//		queue.offer(5);
//		queue.offer(1);
//		queue.offer(2);
//		queue.offer(100);
		
		//System.out.println(queue.peek());
		//queue.clear();
		
		//System.out.println(queue.contains(1));
		
		/* Çalýþmaz
		for (Integer i : queue) {
			System.out.println(i);
		}
		
		*/
//		while (!queue.isEmpty()) {
//			System.out.println("Eleman Çýkarýlýyor : " + queue.poll());
//		}
		
		
	}
}
