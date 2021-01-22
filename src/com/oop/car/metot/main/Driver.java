package com.oop.car.metot.main;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("Renault");
		System.out.println(car.getModel());
		car.setKapılar(0);
		System.out.println(car.getKapılar());
		
		/*
		 * Araba araba2;  //Referans gösterilmemiştir. Hata verir 
		 * 
		 * araba2.setKapılar(10);
		 */
		
		/*
		 * Araba araba3 = null;   -> Null bu referans herhangi bir yeri henüz göstermiyor.
		 */
		
		
	}
}
