package com.oop.ExceptionTryaandCatch.main;

/*
 * 	try {
			Exception olu�turabilecek kodlar
		} catch (Exception e) {
			Exception durumunda yap�lacak i�lemler
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
			//System.out.println("Bir say� 0'a b�l�nemez !");
			//System.out.println("Array'in boyunu a�t�n�z...");
			
			//e.printStackTrace(); Hatan�n java taraf�ndaki a��klamas�n� verir
		}
		System.out.println("Buras� �al���yor....");
		
	}
}
