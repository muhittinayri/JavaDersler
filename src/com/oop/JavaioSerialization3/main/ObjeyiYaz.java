package com.oop.JavaioSerialization3.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Muhittin Ayrý", 1234, "Bilgisayar Mühendisi");
		
		
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
		
		Ogrenci.setOgrenci_sayisi(100);
		
		outputStream.writeObject(ogrenci1);
		
			
		
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý ! ");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu ! ");
		}
	}
}

