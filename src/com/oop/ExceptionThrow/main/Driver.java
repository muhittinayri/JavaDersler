package com.oop.ExceptionThrow.main;

import java.io.IOException;
import java.util.Scanner;

/*
 * Throw : ÝStediðimiz zaman kendi exceptionýmýzý fýrlatabiliriz. 
 * 
 * Throws : 
 */

public class Driver {
	
	public static void mekan_kontrol(int yas) throws IOException{
		if (yas < 18) {
			//throw new ArithmeticException(); //Runtime'da oluþan bir Exception
			throw new IOException();  //Check Exception olduðu için metodun sonuna throws IOException ekliyoruz
		}else {
			System.out.println("Mekana Hoþ Geldiniz...");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen yaþýnýzý giriniz : ");
		int yas = scanner.nextInt();
//		try {
//			mekan_kontrol(yas);
//		} catch (ArithmeticException e) {
//			System.out.println("18 yaþýndan küçükler mekana giremez");
//		}
		
		
		
//		try {
//			mekan_kontrol(yas);
//		} catch (IOException e) {
//			System.out.println("IOException oluþtu...");
//		}
		
		
		mekan_kontrol(yas);
		
		
		
	}
}
