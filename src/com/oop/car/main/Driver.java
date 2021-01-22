package com.oop.car.main;

public class Driver {
	public static void main(String[] args) {
		Car car = new Car();  //Obje oluþturmak için new anahtar kelimesi kullanýlýr.
		car.renk = "Kýrmýzý";
		car.kapýlar = 4;
		car.tekerlekler = 4;
		car.motor = "16V";
		car.model = "Renault";
		System.out.println(car.motor);
	}
}
