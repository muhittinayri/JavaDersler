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
			System.out.println("Dosya açýlýrken IOException oluþtu !");
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatýlýrken bir hata oluþtu ! ");
				}
			}
		}
	}
}
