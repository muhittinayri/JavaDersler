package com.oop.arrays.main;

import java.util.Scanner;

/*
 * Belirli deðerleri belirli veri tiplerindeki deðerleri depoladýðýmýz bir liste gibidir.
 * 
 */

public class Driver {
	
	public static void arrayi_bastir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i+1) + " : " + array[i]);
		}
	}
	
	public static double ortalamabul(int[] array) {
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return ((double)toplam/array.length);
	}
	
	public static void main(String[] args) {
		// int[] a; //int arrayý cinsinden bir tane referans
		// double[] b;

		// int[] a = new int[10]; //Bellekte 10 tane int depolanacak kadar yer açýlýyor
		// ve a referans direk olarak gösteriyor. Arrayler geniþletilemiyorlar yani 11.
		// deðeri alamaz
		/*
		 * a[5] = 32; //Arrayýn 5. indexine 32 deðeri eklenir. a[9] = 50; //Arrayýn son
		 * elemaný 9. indexe 50 deðeri eklenir.
		 */

		// int[] a = {1,2,3,4,5,6,7,8,9,10};
		/*
		 * System.out.println(a[0]); System.out.println(a[2]); System.out.println(a[6]);
		 */

		// int[] a = new int[5];
		/*
		 * for (int i = 0; i < 5; i++) { a[i] = i * 4 + 2;
		 * 
		 * } for (int i = 0; i < 5; i++) { System.out.println(a[i]); }
		 */

//		int[] a = new int[5];
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		for (int i = 0; i < 5; i++) {
//			a[i] = scanner.nextInt();
//			
//		}
//		System.out.println("-------------------------------------");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(a[i]);
//		}
		
		
		
		int[] a = new int[5];
		
		int[] b = {10,20,30,40,50,60};
		
		//System.out.println("Arrayýmizin Uzunluðu " + b.length);
		
		arrayi_bastir(b);
		
		System.out.println("Ortalama : " + ortalamabul(b));
		

	}
}
