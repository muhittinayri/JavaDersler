package com.oop.nostatictinnerclass.main;

import java.util.Scanner;

import com.oop.nostatictinnerclass.main.Matematik.Faktoriyel;

/*
 * �nnerclass (Dahili s�n�flar) : Belirli bir g�revi yapan claslar�n ba�ka bir classlar�n gruplanmas�yla ortaya ��kan yap�lard�r.
 * innerclasslar sayesinde interfacelere ek olarak javada �oklu kal�t�m� yapabilmi� oluyoruz. ��nk� bizim classlar�m�z birbirinin i�erisine giriyor ve 
 * bu classlar�m�z �stteki ba�ka bir classdan direk �zelliklerini ve metotlar�n� direk olarak kullanabiliyor. 
 * 
 * �nner classlar 4 �e�ittir.
 * 1- Statik olmayan inner classlar
 * 2- Statik inner classlar
 * 3- Lokal(Yerel) Inner classlar
 * 4- Anonymous (Anonim) Inner classlar
 * 
 */

public class Driver {
	public static void main(String[] args) {
		//Innerclasslar�n obje olu�turulmas� -- A�a��daki kodda �lk �nce matemati�i olu�turuyoruz daha sonra matemati�in i�erisindeki faktoriyeli olu�turuyoruz.
		Matematik.Faktoriyel faktoriyel = new Matematik().new Faktoriyel();
     	
		Matematik.Asal asal = new Matematik().new Asal();
     	Matematik.Alan alan = new Matematik().new Alan();
     	
     	Scanner scanner = new Scanner(System.in);
     	
     	System.out.println("Bir tane say� giriniz : ");
     	int sayi = scanner.nextInt();
     	
     	if (asal.asal_mi(sayi)) {
			System.out.println("Say� asald�r");
		}else {
			System.out.println("Bu say� asal de�ildir !");
		}
     	
     	faktoriyel.faktoriyel();
     	
     	alan.daire_alan(5);
		
		
	}
}
