package com.oop.JavaioFileWriter.main;

import java.io.FileWriter;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		FileWriter writer = null;

		try {
			writer = new FileWriter("FileWriterDosya.txt");
			writer.write("Muhittin Ayri\n");
			writer.write("Mehmet Ayri\n");
			
		} catch (IOException e) {
			System.out.println("Dosya a��l�rken IOException olu�tu !");
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapat�l�rken bir hata olu�tu ! ");
				}
			}
		}
	}
}
