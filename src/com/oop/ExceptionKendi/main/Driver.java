package com.oop.ExceptionKendi.main;

import java.util.Scanner;

public class Driver {
	
	public static void mekan_kontrol(int yas) {
		if (yas < 18) {
			throw new InvalidAgeException("Invalid Age");
		}else {
			System.out.println("Mekana Hoþ geldiniz");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yaþýnýzý giriniz : ");
		int yas = scanner.nextInt();
		
		try {
			mekan_kontrol(yas);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		
		
	}
}
