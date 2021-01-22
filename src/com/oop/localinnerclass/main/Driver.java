package com.oop.localinnerclass.main;

/*
 * Local inner classlar metotlarýn bir üyesi oluyor. Yani metotlarýn içerisine sanki bir deðiþken tanýmlarmýþ gibi belirli bir iþlem yaparmýþ gibi metotlarýmýzýn içerisinde classlarýmýzý tanýmlýyoruz
 * ve bu classlar da local inner classlar oluyor
 * Local inner classlara baþka bir metotdan eriþilemiyor.
 * Metoda özgüdür.
 * 
 * 
 */

public class Driver {
	public static void main(String[] args) {
		//Local innerclass
		class Alan{
			public void daire_alan(int yaricap) {
				System.out.println("Dairenin alaný : " + (yaricap * yaricap) * Math.PI);
			}
		}
		
		Alan alan = new Alan();
		alan.daire_alan(10);
	}
	/* Eriþilemez
	public static void deneme() {
		Alan alan1 = new Alan();
	}
	*/
}
