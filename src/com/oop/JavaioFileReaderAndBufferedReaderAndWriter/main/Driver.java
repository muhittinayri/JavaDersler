package com.oop.JavaioFileReaderAndBufferedReaderAndWriter.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *Eðer dosyalar .txt uzantýsý ise fileReader veya BufferReader ile okumamýz çok daha efektiftir.
 *Çok büyük bir dosyayý okumak için Buffered Reader kullanýlmasý gerekir. 
 *
 *FileReader ile BufferedReader arasýndaki fark?
 *FileReader = Karakter karakter okuyor ve dosyaya çok fazla eriþim saðlýyor.
 *BufferReader = Kendi içinde bir tane küme oluþturuyor. Dosyada \n görene kadar bütün karakterleri okuyor. Dosyaya daha az eriþim saðlýyor.
 *Hýz konusunda BufferReader daha hýzlýdýr.
 */

public class Driver {
	public static void main(String[] args) {
		//FileReader Kullanýmý
		//Dosyadan veri okuyacak 
		/*
		try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))){
			while (scanner.hasNextLine()) {
				//System.out.println("Okunan Satýr : " + scanner.nextLine());
				String ogrenciBilgisi = scanner.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				if (array[1].equals("Bilgisayar Mühendisi")) {
					System.out.println("Öðrenci Bilgisi : " + ogrenciBilgisi);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadý !");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu ! ");
		}
		*/
		
		//BufferedReader Kullanýmý
		
		/*
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
			while (scanner.hasNextLine()) {
				//System.out.println("Okunan Satýr : " + scanner.nextLine());
				String ogrenciBilgisi = scanner.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				if (array[1].equals("Bilgisayar Mühendisi")) {
					System.out.println("Öðrenci Bilgisi : " + ogrenciBilgisi);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadý !");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken bir hata oluþtu ! ");
		}*/
		
		
		//Dosyaya yazmak
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
			writer.write("Ali Ayrý,Otomotiv \n");
		} catch (IOException e) {
			System.out.println("Dosya açýlýrken hata oluþtu ! ");
		}
		
	}
}
