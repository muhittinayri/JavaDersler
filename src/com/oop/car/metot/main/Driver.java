package com.oop.car.metot.main;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("Renault");
		System.out.println(car.getModel());
		car.setKap�lar(0);
		System.out.println(car.getKap�lar());
		
		/*
		 * Araba araba2;  //Referans g�sterilmemi�tir. Hata verir 
		 * 
		 * araba2.setKap�lar(10);
		 */
		
		/*
		 * Araba araba3 = null;   -> Null bu referans herhangi bir yeri hen�z g�stermiyor.
		 */
		
		
	}
}
