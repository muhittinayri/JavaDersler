package com.oop.nostatictinnerclass.main;

import java.util.Scanner;

import com.oop.nostatictinnerclass.main.Matematik.Faktoriyel;

/*
 * Ýnnerclass (Dahili sýnýflar) : Belirli bir görevi yapan claslarýn baþka bir classlarýn gruplanmasýyla ortaya çýkan yapýlardýr.
 * innerclasslar sayesinde interfacelere ek olarak javada çoklu kalýtýmý yapabilmiþ oluyoruz. çünkü bizim classlarýmýz birbirinin içerisine giriyor ve 
 * bu classlarýmýz üstteki baþka bir classdan direk özelliklerini ve metotlarýný direk olarak kullanabiliyor. 
 * 
 * Ýnner classlar 4 çeþittir.
 * 1- Statik olmayan inner classlar
 * 2- Statik inner classlar
 * 3- Lokal(Yerel) Inner classlar
 * 4- Anonymous (Anonim) Inner classlar
 * 
 */

public class Driver {
	public static void main(String[] args) {
		//Innerclasslarýn obje oluþturulmasý -- Aþaðýdaki kodda Ýlk önce matematiði oluþturuyoruz daha sonra matematiðin içerisindeki faktoriyeli oluþturuyoruz.
		Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
     	
		Matematik.Asal asal = new Matematik().new Asal();
     	Matematik.Alan alan = new Matematik().new Alan();
     	
     	Scanner scanner = new Scanner(System.in);
     	
     	System.out.println("Bir tane sayý giriniz : ");
     	int sayi = scanner.nextInt();
     	
     	if (asal.asal_mi(sayi)) {
			System.out.println("Sayý asaldýr");
		}else {
			System.out.println("Bu sayý asal deðildir !");
		}
     	
     	faktoriyel.faktoriyel();
     	
     	alan.daire_alan(5);
		
		
	}
}
