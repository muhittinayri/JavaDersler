package com.oop.autuboxingandunboxing.main;

import java.util.ArrayList;
/*
 * Wrapper Class
 * 
 */
public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();  //<> Aras�na referans yaz�lmas� gerekiyor. <> �lkel Veri tipleri kabul etmez
		
		/*
		for (int i = 0; i < 10; i++) {
			arraylist2.add(Integer.valueOf(i*4)); //Autoboxing : Primitiv yani �lkel veri tipi olan i de�erini bir kutuya al�yoruz ve bunu wrapper class cinsinde arrayliste at�yoruz.
			
		}
		
		for (int i = 0; i < arraylist2.size(); i++) {
			System.out.println(arraylist2.get(i).intValue());  //Unboxing : int referans�n� ald�k ve onun i�indeki int valueyi almak istiyorum �eklinde unboxing yapm�� oluruz
			
		}
		*/
		
		for (int i = 0; i < 10; i++) {
			arraylist2.add(i*4);  //Integer.valueof(i*4)
		}
		
		for (int i = 0; i < arraylist2.size(); i++) {
			System.out.println(arraylist2.get(i)); //arraylist2.get(i).intValue() 
		}
		
		
		
	}
}
