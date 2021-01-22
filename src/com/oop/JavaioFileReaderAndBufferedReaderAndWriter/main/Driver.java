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
 *E�er dosyalar .txt uzant�s� ise fileReader veya BufferReader ile okumam�z �ok daha efektiftir.
 *�ok b�y�k bir dosyay� okumak i�in Buffered Reader kullan�lmas� gerekir. 
 *
 *FileReader ile BufferedReader aras�ndaki fark?
 *FileReader = Karakter karakter okuyor ve dosyaya �ok fazla eri�im sa�l�yor.
 *BufferReader = Kendi i�inde bir tane k�me olu�turuyor. Dosyada \n g�rene kadar b�t�n karakterleri okuyor. Dosyaya daha az eri�im sa�l�yor.
 *H�z konusunda BufferReader daha h�zl�d�r.
 */

public class Driver {
	public static void main(String[] args) {
		//FileReader Kullan�m�
		//Dosyadan veri okuyacak 
		/*
		try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))){
			while (scanner.hasNextLine()) {
				//System.out.println("Okunan Sat�r : " + scanner.nextLine());
				String ogrenciBilgisi = scanner.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				if (array[1].equals("Bilgisayar M�hendisi")) {
					System.out.println("��renci Bilgisi : " + ogrenciBilgisi);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamad� !");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu ! ");
		}
		*/
		
		//BufferedReader Kullan�m�
		
		/*
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
			while (scanner.hasNextLine()) {
				//System.out.println("Okunan Sat�r : " + scanner.nextLine());
				String ogrenciBilgisi = scanner.nextLine();
				String[] array = ogrenciBilgisi.split(",");
				if (array[1].equals("Bilgisayar M�hendisi")) {
					System.out.println("��renci Bilgisi : " + ogrenciBilgisi);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamad� !");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken bir hata olu�tu ! ");
		}*/
		
		
		//Dosyaya yazmak
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){
			writer.write("Ali Ayr�,Otomotiv \n");
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken hata olu�tu ! ");
		}
		
	}
}
