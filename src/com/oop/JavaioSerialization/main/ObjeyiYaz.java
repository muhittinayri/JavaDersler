package com.oop.JavaioSerialization.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
	public static void main(String[] args) {
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
			Ogrenci ogrenci1 = new Ogrenci("Muhittin Ayrý", 1234, "Bilgisayar Mühendisi");
			Ogrenci ogrenci2 = new Ogrenci("Ali Ayrý",4321,"Otomotiv");
			
			outputStream.writeObject(ogrenci1);
			outputStream.writeObject(ogrenci2);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý ! ");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu ! ");
		}
	}
}
