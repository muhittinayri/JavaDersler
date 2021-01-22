package com.oop.JavaioSerialization2.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Muhittin Ayrý", 1234, "Bilgisayar Mühendisi");
		Ogrenci ogrenci2 = new Ogrenci("Mustafa Murat Çoþkun",4321,"Yönetim Biliþim Sistemleri");
		Ogrenci ogrenci3 = new Ogrenci("Oðuz Ayrý",678,"Finansal Matematik");
		
		Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3};
		ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));  //asList = Bir tane öðrencci arrayi vereceðiz ve daha sonra ogrenci arrayi içerisindeki objelerini arrayliste atamýþ  olur
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			
		outputStream.writeObject(ogrenci_array);
		outputStream.writeObject(ogrenci_list);
			
		
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý ! ");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu ! ");
		}
	}
}
