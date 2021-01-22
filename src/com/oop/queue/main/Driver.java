package com.oop.queue.main;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue : FIFO - �lk giren ilk ��kar yap�s� vard�r
 * Queue(Kuyruk) �nterface'ini implemente eden LinkedList class� FIFO mant���yla �al���r
 * add(Eleman) : Eleman� kuyru�a ekler. Ekleyemezse hata f�rlat�r.
 * offer(Eleman) : Eleman� kuyru�a ekler. Eklerse True, Ekleyemezse False d�nder
 * remove() : Kuyru�un en ba��ndaki eleman� kuyruktan ��kar�r. Kuyruk bo� ise hata f�rlat�r.
 * poll() : Kuyru�un en ba��ndaki eleman� kuyrultan ��kar�r. Kuyruk bo� ise null referans d�ner.
 * element() : Kuyru�un en ba��ndaki eleman� d�ner. Kuyruk bo� ise hata f�rlat�r.
 * peek() ; Kuyru�un en ba��ndaki eleman� d�ner Kuyruk bo� ise nul referans d�ner
 *
 */
public class Driver {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Java");
		queue.offer("Python");
		queue.offer("PHP");
		queue.offer("C++");
		/*
		//System.out.println(queue.peek());
		
		for (String s : queue) {
			System.out.println(s);
		}
		
		System.out.println("****************");
		System.out.println("Eleman ��kar�l�yor : " + queue.poll());
		
		for (String s : queue) {
			System.out.println(s);
		}
		
		//System.out.println(queue.isEmpty());
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman ��kar�l�yor : " + queue.poll());
		}
		System.out.println(queue.isEmpty());
		*/
		
		
	}
}
