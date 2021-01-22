package com.oop.PriorityQueue.main;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue Interface ve PriorityQueue S�n�f�
 * 
 * PriorityQueue normal Queue mant��� gibi davranmaz. Elemanlar �ncelik s�ralar�na g�re y�ksek �ncelik kazan�p 
 * (
 * Integerlarda en y�ksek �ncelik en k���k say�da, en d���k �ncelik en b�y�k say�dad�r
 * Stringlerde en y�ksek �ncelik alfabetik olarak s�zl�kte en �nce gelen stringte,
 * en d���k �ncelik alfabetik olarak s�zl�kte en son gelen stringtedir.
 * 
 * 
 * kuyrukta �nlere ge�er (T�pk� hastanelerdeki acil servisler gibi)
 * add veya offer() metotlar� ---> kuyru�a eleman ekler. (�nceden g�rd���m�z �zellikleri ta��rlar)
 * clear() metodu : Kuyru�u temizler
 * contains(Object o) : o objesi kuyru�un i�indeyse true, de�ilse false d�ner.
 * peek() : Kuyru�un ba��ndaki eleman� d�ner. E�er kuyruk bo�sa null referans d�ner.
 * poll() : Kuyru�un ba��ndaki eleman� ��kart�r ve de�er olarak d�ner. E�er kuyruk bo�sa null referans d�ner
 * size() : Kuyru�un i�indeki eleman say�s�n� d�ner.
 * 
 */

class Player implements Comparable<Player>{
	private String isim;
	private int id;
	
	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}
	
	
	//�dsi k���k olan� daha �ncelikli yap
	@Override
	public int compareTo(Player player) {
		if (this.id < player.id) {
			return -1;
		}else if (this.id > player.id) {
			return 1;
		}
		return 0;
	}


	
	//Ekrana yazd�rmak istedi�imizde toString metodunu eklememiz gerekiyor
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
		queue.offer(new Player("O�uz", 100));
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman ��kar�l�yor : " + queue.poll());
		}
		
//		queue.offer(5);
//		queue.offer(1);
//		queue.offer(2);
//		queue.offer(100);
		
		//System.out.println(queue.peek());
		//queue.clear();
		
		//System.out.println(queue.contains(1));
		
		/* �al��maz
		for (Integer i : queue) {
			System.out.println(i);
		}
		
		*/
//		while (!queue.isEmpty()) {
//			System.out.println("Eleman ��kar�l�yor : " + queue.poll());
//		}
		
		
	}
}
