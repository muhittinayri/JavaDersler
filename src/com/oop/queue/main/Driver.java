package com.oop.queue.main;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue : FIFO - Ýlk giren ilk çýkar yapýsý vardýr
 * Queue(Kuyruk) Ýnterface'ini implemente eden LinkedList classý FIFO mantýðýyla çalýþýr
 * add(Eleman) : Elemaný kuyruða ekler. Ekleyemezse hata fýrlatýr.
 * offer(Eleman) : Elemaný kuyruða ekler. Eklerse True, Ekleyemezse False dönder
 * remove() : Kuyruðun en baþýndaki elemaný kuyruktan çýkarýr. Kuyruk boþ ise hata fýrlatýr.
 * poll() : Kuyruðun en baþýndaki elemaný kuyrultan çýkarýr. Kuyruk boþ ise null referans döner.
 * element() : Kuyruðun en baþýndaki elemaný döner. Kuyruk boþ ise hata fýrlatýr.
 * peek() ; Kuyruðun en baþýndaki elemaný döner Kuyruk boþ ise nul referans döner
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
		System.out.println("Eleman Çýkarýlýyor : " + queue.poll());
		
		for (String s : queue) {
			System.out.println(s);
		}
		
		//System.out.println(queue.isEmpty());
		
		while (!queue.isEmpty()) {
			System.out.println("Eleman Çýkarýlýyor : " + queue.poll());
		}
		System.out.println(queue.isEmpty());
		*/
		
		
	}
}
