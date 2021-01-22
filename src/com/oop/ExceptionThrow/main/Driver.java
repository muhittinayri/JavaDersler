package com.oop.ExceptionThrow.main;

import java.io.IOException;
import java.util.Scanner;

/*
 * Throw : �Stedi�imiz zaman kendi exception�m�z� f�rlatabiliriz. 
 * 
 * Throws : 
 */

public class Driver {
	
	public static void mekan_kontrol(int yas) throws IOException{
		if (yas < 18) {
			//throw new ArithmeticException(); //Runtime'da olu�an bir Exception
			throw new IOException();  //Check Exception oldu�u i�in metodun sonuna throws IOException ekliyoruz
		}else {
			System.out.println("Mekana Ho� Geldiniz...");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen ya��n�z� giriniz : ");
		int yas = scanner.nextInt();
//		try {
//			mekan_kontrol(yas);
//		} catch (ArithmeticException e) {
//			System.out.println("18 ya��ndan k���kler mekana giremez");
//		}
		
		
		
//		try {
//			mekan_kontrol(yas);
//		} catch (IOException e) {
//			System.out.println("IOException olu�tu...");
//		}
		
		
		mekan_kontrol(yas);
		
		
		
	}
}
