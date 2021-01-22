package com.oop.autuboxingandunboxing.main;

import java.util.ArrayList;
/*
 * Wrapper Class
 * 
 */
public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();  //<> Arasýna referans yazýlmasý gerekiyor. <> Ýlkel Veri tipleri kabul etmez
		
		/*
		for (int i = 0; i < 10; i++) {
			arraylist2.add(Integer.valueOf(i*4)); //Autoboxing : Primitiv yani Ýlkel veri tipi olan i deðerini bir kutuya alýyoruz ve bunu wrapper class cinsinde arrayliste atýyoruz.
			
		}
		
		for (int i = 0; i < arraylist2.size(); i++) {
			System.out.println(arraylist2.get(i).intValue());  //Unboxing : int referansýný aldýk ve onun içindeki int valueyi almak istiyorum þeklinde unboxing yapmýþ oluruz
			
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
