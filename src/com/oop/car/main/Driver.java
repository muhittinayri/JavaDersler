package com.oop.car.main;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();  //Obje olu�turmak i�in new anahtar kelimesi kullan�l�r.
		car.renk = "K�rm�z�";
		car.kap�lar = 4;
		car.tekerlekler = 4;
		car.motor = "16V";
		car.model = "Renault";
		System.out.println(car.motor);
	}
}
