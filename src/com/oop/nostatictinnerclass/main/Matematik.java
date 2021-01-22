package com.oop.nostatictinnerclass.main;

import java.util.Scanner;

public class Matematik {
	
	private double PI = Math.PI;
	
	
	//Innerclass
	public class Faktoriyel{
		public void faktoriyel() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bir say� giriniz : " );
			int sayi = scanner.nextInt();
			int fakt = 1;
			for (int i = 2; i <= sayi; i++) {
				fakt *= i;
			}
			System.out.println("Faktoriyel : " + fakt);
		}
	}
	
	//Innerclass
	public class Asal{
		public boolean asal_mi(int sayi) {
			int i = 2;
			while (i < sayi) {
				if (sayi % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
	}
	
	//Innerclass
	public class Alan{
		
		public void daire_alan(int yaricap) {
			System.out.println("Dairenin alan� : " + (yaricap * yaricap) * PI);
		}
	}
	
	
}	
