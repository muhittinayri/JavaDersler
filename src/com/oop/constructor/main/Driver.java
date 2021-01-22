package com.oop.constructor.main;

public class Driver {
	public static void main(String[] args) {
		
		Account account = new Account();
		Account account2 = new Account("123123", 1000.0, "Muti Ayrý", "ayri.muhittin@gmail.com", "12345678910");
		
		account2.paraYatir(500);
		account2.paraCekme(100);
		
	}
}
