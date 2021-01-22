package com.oop.JavaioSerialization.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
	public static void main(String[] args) {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			Ogrenci ogrenci1 = new Ogrenci("Muhittin Ayr�", 1234, "Bilgisayar M�hendisi");
			Ogrenci ogrenci2 = new Ogrenci("Ali Ayr�",4321,"Otomotiv");
			
			outputStream.writeObject(ogrenci1);
			outputStream.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamad� ! ");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu ! ");
		}
	}
}
