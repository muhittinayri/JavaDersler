package com.oop.JavaioSerialization.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
	public static void main(String[] args) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {

			Ogrenci ogrenci = (Ogrenci) inputStream.readObject();
			Ogrenci ogrenci2 = (Ogrenci)inputStream.readObject();
			
			System.out.println("**************************");
			System.out.println(ogrenci);
			System.out.println("**************************");
			System.out.println(ogrenci2);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadý");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu");
		} catch (ClassNotFoundException e) {
			System.out.println("Sýnýf bulunamadý ! ");
		}

	}
}
