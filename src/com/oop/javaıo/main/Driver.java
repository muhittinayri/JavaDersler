package com.oop.javaýo.main;

/*
 * JAVA I / O : dosyalardan ve deðiþik kaynaklardan input almak ve dosyalara deðiþik kaynaklara output yazmak için bir API olarak bilinir.
 * Input ve Output iþlerini hýzlandýrmak için Java streamleri kullanýlýr. JAVA I/O Apisinin içinde input,output iþlemleri için onlarca sýnýf bulunur.
 * 
 * 
 * Stream Nedir ?
 * 
 * Stream verilerin input ve output yoluyla Java projelerine aktýðý bir veri dizisidir ve Javada streamler verilerin byte (1 ve 0) halinde aktýðý yapýlarýdýr
 * Javadaki standart streamlerden bir tanesini aslýnda daha önce kullandýk. Javada hazýr kullanmamýz için oluþturulmuþ 3 tane hazýr stream bulunmaktadýr.
 * System.out : Standart Output Stream
 * System.err : Standar Error Stream
 * System.in : Standar Input Stream
 * 
 * 
 * Output Stream : Java uygulamalarý bir dosyaya, bir sockete ve baðlanmýþ bir aygýta veriyi Stream halinde yazmak (byte halinde 1 ve 0'lar ile) için
 * OutputStream abstract  classýndan (soyut sýnýf) türeyen bir alt sýnýf kullanýlýr.
 * 
 * write() metodu : Belli bir byte dizisini veya tek bir byte'ý hedefe yazar.
 * flush() metodu : Herhangi bir bufferlanmýþ veri varsa bu metod sayesinde hemen hedefe yazýlmasýný söylemiþ oluruz.
 * close() metodu : OutputStream'i kapatýr.
 * 
 * 
 * 
 * InputStream : Java uygulamalarý bir dosyadan, bir socketten ve baðlanmýþ bir aygýttan veriyi Stream halinde okumak (byte halinde 1 ve 0'lar ile) için InputStream abstract classýndan (soyut sýnýf) türeyen bir alt sýnýfý kullanýr
 * 
 * read() metodu : Kaynaktan bir sonraki byte'ý okur. Okuyacak herhangi bir byte yoksa -1 deðeri döner
 * available() metodu : Okunabilecek byte sayýsýný döner.
 * close() metodu : InputStrem'i kapatýr.
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Driver {
	public static void main(String[] args) {
		
	}
}
