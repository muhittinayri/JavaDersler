package com.oop.JavaioSerialization2.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Muhittin Ayr�", 1234, "Bilgisayar M�hendisi");
		Ogrenci ogrenci2 = new Ogrenci("Mustafa Murat �o�kun",4321,"Y�netim Bili�im Sistemleri");
		Ogrenci ogrenci3 = new Ogrenci("O�uz Ayr�",678,"Finansal Matematik");
		
		Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3};
		ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));  //asList = Bir tane ��rencci arrayi verece�iz ve daha sonra ogrenci arrayi i�erisindeki objelerini arrayliste atam��  olur
		
		try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			
		outputStream.writeObject(ogrenci_array);
		outputStream.writeObject(ogrenci_list);
			
		
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamad� ! ");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu ! ");
		}
	}
}
