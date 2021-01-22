package com.oop.JavaioFileInputStream.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("FileOutputSreamDosya.txt");
					
			//System.out.println("Okunan Deðer : " + (char) (fileInputStream.read()));
			
			/*fileInputStream.skip(5);
			System.out.println("Okunan Karakter : " + (char) (fileInputStream.read()));*/
			/*
			int deger;
			String s = "";
			
			while ((deger = fileInputStream.read()) != -1) {
				s += (char) deger;
			}
			System.out.println("Okunan Karakter : " + s);
			 */
			
			
			int deger;
			String s = "";
			int say = 0;
			fileInputStream.skip(5);
			
			while ((deger = fileInputStream.read()) != -1) {
				s += (char) deger;
				say++;
				if (say == 10) {
					break;
				}
			}
			System.out.println("Okunan Karakter : " + s);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File bulunamadý ! ");
		}catch (IOException e) {
			System.out.println("Dosya okunurken hata oluþtu ! ");
		}finally {
			try {
				//Dosya açýlmýþsa ve herhangi bir hata olmuþsa fileInputStream null olmayacak ve burada dosyayý kapatacak
				//if olmasa idi nullpointer exception oluþurdu
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
				System.out.println("Dosya kapatýlýrken bir sorun oluþtu !");
			}
		}
		
	}
}
