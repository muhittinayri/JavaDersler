package com.oop.JavaioTryWithResource.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		try(FileWriter writer1 = new FileWriter("FileWriterTryWithResourceDiller.txt")){
			Scanner scanner = new Scanner(System.in);
			String dil;
			while (true) {
				System.out.println("Bir dil giriniz : ");
				dil = scanner.nextLine();
				
				if (dil.equals("-1")) {
					System.out.println("Çýkýþ yapýlýyor");
					break;
				}
				writer1.write(dil + "\n"); 
			}
		} catch (IOException e) {
			System.out.println("Dosya oluþturulurken hata oluþtu ! ");
		}
	}
}
