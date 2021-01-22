package com.oop.javaioFileOutputStream.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


	

public class Driver {
	
	public static void main(String[] args) {
		FileOutputStream fos = null;
		//File file = new File("dosya.txt");
		

		
		try {
			//true : Bu dosyan�n i�eri�i varsa sona ekle, yoksa yeni olu�tur
			fos = new FileOutputStream("FileOutputSreamDosya.txt",true);
				/*byte[] array = {101, 75 ,66 ,68};
				fos.write(array);*/
			
			String s = "Muhittin Ayr�";
			byte[] s_array = s.getBytes();
			fos.write(s_array);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not found exception olu�tu ! ");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Dosya kapat�l�rken bir hata olu�tu ! ");
			}
		}
	}
}



