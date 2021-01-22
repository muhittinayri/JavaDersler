package com.oop.vectorandStack.main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/*
 * Vectorler synchronized anahtar kelimesi ile yazýlmýþtýr. anlamý eðer farklý threadlerimiz bir arrayList üzerinde uðraþýyor ise 
 * ve bu arraylist'in üzerinde uðraþtýðý metot eðer synchronized deðil ise bu threadler burada karýþýklýða sebeb oluyor yani 
 * objeye direk ayný anda eriþebiliyor. ve karýþýklýk olabiliyor. 
 * Vectorlerde synchronized ile bir thread bir iþi çalýþtýrýcak ve o metota baþka hiç bir thread giremicek.
 * 
 * 
 * 
 * Vectorler threadlerde çok güvenli ancak arraylistlere göre biraz daha yavaþ performans sergiler.
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
		
		//Ýterator kullanarak ekrana yazdýrma
		/*
		 * ListIterator<String> iterator = vector.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		
		/*
		//Enumaration ile ekrana yazdýrma
		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		*/
		
/*
		System.out.println("Ýlk eleman : " + vector.firstElement());
		System.out.println("Son eleman : " + vector.lastElement());
*/		
		
		/*
		 * Stackler vector clasýndan extend edilir. 
		 * LIFO þeklide çalýþýr -son giren ilk çýkar-
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
		
		
		//Son elemaný alýr
		//System.out.println(stack.peek());
		
		//Son elemaný çýkarýr
		//System.out.println("Son eleman çýkarlýyor : " + stack.pop());
		
		/*
		for (String s : stack) {
			System.out.println(s);
		}
		
		//Stack boþ ise true deðilse false dönderir
		System.out.println(stack.empty());
		*/
		
		while (!stack.empty()) {
			System.out.println("Eleman çýkarýlýyor " + stack.pop());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
