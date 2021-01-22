package com.oop.localinnerclass.main;

/*
 * Local inner classlar metotlar�n bir �yesi oluyor. Yani metotlar�n i�erisine sanki bir de�i�ken tan�mlarm�� gibi belirli bir i�lem yaparm�� gibi metotlar�m�z�n i�erisinde classlar�m�z� tan�ml�yoruz
 * ve bu classlar da local inner classlar oluyor
 * Local inner classlara ba�ka bir metotdan eri�ilemiyor.
 * Metoda �zg�d�r.
 * 
 * 
 */

public class Driver {
	public static void main(String[] args) {
		//Local innerclass
		class Alan{
			public void daire_alan(int yaricap) {
				System.out.println("Dairenin alan� : " + (yaricap * yaricap) * Math.PI);
			}
		}
		
		Alan alan = new Alan();
		alan.daire_alan(10);
	}
	/* Eri�ilemez
	public static void deneme() {
		Alan alan1 = new Alan();
	}
	*/
}
