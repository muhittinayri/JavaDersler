package com.oop.JavaioSerialization2.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
	public static void main(String[] args) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {

			Ogrenci[] ogrenci_array = (Ogrenci[])inputStream.readObject();
			
			ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>)inputStream.readObject();  //ArrayList Serializable interface'ini implemente ediyor.
			
			System.out.println("********************************");
			for (Ogrenci o : ogrenci_array) {
				System.out.println(o);
				System.out.println("---------------------------------------");
			}
			
			System.out.println("********************************");
			for (Ogrenci o2 : ogrenci_list) {
				System.out.println(o2);
				System.out.println("---------------------------------------");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamad�");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu");
		} catch (ClassNotFoundException e) {
			System.out.println("S�n�f bulunamad� ! ");
		}

	}
}
