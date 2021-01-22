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
			//true : Bu dosyanýn içeriði varsa sona ekle, yoksa yeni oluþtur
			fos = new FileOutputStream("FileOutputSreamDosya.txt",true);
				/*byte[] array = {101, 75 ,66 ,68};
				fos.write(array);*/
			
			String s = "Muhittin Ayrý";
			byte[] s_array = s.getBytes();
			fos.write(s_array);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not found exception oluþtu ! ");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Dosya kapatýlýrken bir hata oluþtu ! ");
			}
		}
	}
}



