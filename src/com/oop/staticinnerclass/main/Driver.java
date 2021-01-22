package com.oop.staticinnerclass.main;

public class Driver {
	public static void main(String[] args) {
		Matematik.Alan alan = new Matematik.Alan();
		alan.daire_alan(5);
		
		Matematik.Alan.daire_alan(6);  //Methodu da static yapar isek bu þekilde kullanabiliyoruz
	}
}
