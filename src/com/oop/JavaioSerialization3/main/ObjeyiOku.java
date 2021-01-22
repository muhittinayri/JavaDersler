package com.oop.JavaioSerialization3.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
	public static void main(String[] args) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {

			Ogrenci ogrenci = (Ogrenci)inputStream.readObject();
			System.out.println(ogrenci);
			System.out.println("Ogrenci Say�s� : " + ogrenci.getOgrenci_sayisi());
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamad�");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu");
		} catch (ClassNotFoundException e) {
			System.out.println("S�n�f bulunamad� ! ");
		}

	}
}
