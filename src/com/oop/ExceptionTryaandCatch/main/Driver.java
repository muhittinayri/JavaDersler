package com.oop.ExceptionTryaandCatch.main;

/*
 * 	try {
			Exception oluþturabilecek kodlar
		} catch (Exception e) {
			Exception durumunda yapýlacak iþlemler
		}
 */

public class Driver {
	public static void main(String[] args) {
		//int a = 30 / 0;  //Unchecked Exception
		
		//ArrayIndexOutOfBoundsException
		//int[] a = {1,2,3,4,5}; 
		//System.out.println(a[6]);
		
		try {
			//int a = 30 / 0;  //AritmeticException
			
			/*int[] a = {1,2,3,4,5};
			System.out.println(a[6]);*/
			
		} catch (Exception e) {
			//System.out.println("Bir sayý 0'a bölünemez !");
			//System.out.println("Array'in boyunu aþtýnýz...");
			
			//e.printStackTrace(); Hatanýn java tarafýndaki açýklamasýný verir
		}
		System.out.println("Burasý çalýþýyor....");
		
	}
}
