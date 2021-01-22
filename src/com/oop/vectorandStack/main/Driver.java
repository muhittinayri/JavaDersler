package com.oop.vectorandStack.main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/*
 * Vectorler synchronized anahtar kelimesi ile yaz�lm��t�r. anlam� e�er farkl� threadlerimiz bir arrayList �zerinde u�ra��yor ise 
 * ve bu arraylist'in �zerinde u�ra�t��� metot e�er synchronized de�il ise bu threadler burada kar���kl��a sebeb oluyor yani 
 * objeye direk ayn� anda eri�ebiliyor. ve kar���kl�k olabiliyor. 
 * Vectorlerde synchronized ile bir thread bir i�i �al��t�r�cak ve o metota ba�ka hi� bir thread giremicek.
 * 
 * 
 * 
 * Vectorler threadlerde �ok g�venli ancak arraylistlere g�re biraz daha yava� performans sergiler.
 */

public class Driver {
	public static void main(String[] args) {
		/*
		Vector<String> vector = new Vector<String>();
		
		vector.add("Java");
		vector.add("Python");
		vector.add("Python");
		vector.add("Php");
		*/
		/*
		for (String s : vector) {
			System.out.println(s);
		}
		*/
		
		//�terator kullanarak ekrana yazd�rma
		/*
		 * ListIterator<String> iterator = vector.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		
		/*
		//Enumaration ile ekrana yazd�rma
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		*/
		
/*
		System.out.println("�lk eleman : " + vector.firstElement());
		System.out.println("Son eleman : " + vector.lastElement());
*/		
		
		/*
		 * Stackler vector clas�ndan extend edilir. 
		 * LIFO �eklide �al���r -son giren ilk ��kar-
		 */
		
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Python");
		stack.push("PHP");
		stack.push("Go");
		/*
		for (String s : stack) {
			System.out.println(s);
		}
		*/
		
		/*
		Enumeration<String> enumeration = stack.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		*/
		
		
		//Son eleman� al�r
		//System.out.println(stack.peek());
		
		//Son eleman� ��kar�r
		//System.out.println("Son eleman ��karl�yor : " + stack.pop());
		
		/*
		for (String s : stack) {
			System.out.println(s);
		}
		
		//Stack bo� ise true de�ilse false d�nderir
		System.out.println(stack.empty());
		*/
		
		while (!stack.empty()) {
			System.out.println("Eleman ��kar�l�yor " + stack.pop());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
