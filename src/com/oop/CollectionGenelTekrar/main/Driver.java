package com.oop.CollectionGenelTekrar.main;
/*
 * List Interface'i implemente eden Classlar.
 * 
 * Elementleri liste halinde depolar
 * Bir elemen birden fazla bulunabilir
 * Elementler indeks ile tutulur
 * Elementler eklenme sýrasýný korur
 * Bir elemaný aramak çok yavaþtýr
 * Bir elemana indeks deðeri ile ulaþmak hýzlýdýr
 * Listeler Collections.sort() metoduyla sýralanabilir
 * 
 * 
 * Thread Ýþlemlerinde Kullanabilecek Veri Yapýsý
 * 
 * Vectorler -> Çünkü bazý metodlarý "Synchronized" anahtar kelimesiyle yazýlmýþtýr.
 * 
 * Elemanlarý sadece sona eklediðimiz durumlarda
 * 
 * ArrayList -> Çünkü sadece sona eklemek arraylistlerde daha hýzlýdýr.
 * 
 * 
 * Elemaný Ortalara Ekleyeceðimiz Durumlar Varsa
 * 
 * LinkedList -> Çünkü sadece o bölgenin referanslarý üzerinde iþlem yapýlýr.
 * 
 * -----------------------------------------------------------------------------------------------------------------------------
 * 
 * Set Interface'inin implemente eden classlar
 * 
 * Bir elemaný sadece bir defa depolar.
 * Bir elemanýn sadece bir defa depolanmasýný istiyorsak listler(ArrayList,LinkedList, vs) yerine kullanýlabilir.
 * Elemanlar listler gibi indekslenmezler
 * Bir elemaný setlerde olup olmadýðýný sorgulama listlere göre oldukça hýzlýdýr.
 * 
 * Elemanlarýn Sýrasý önemli deðilse ve sorgulama iþlerinin hýzlý olmasý isteniyorsa
 * 
 * HashSet -> Elemanlarý ekleme sýrasýna göre depolamaz ve bir elemanýn olup olmadýðýný sorgulama hash fonksiyonuyla yapýldýðý için her zaman hýzlý
 * ve sabit zamanda çalýþýr.
 * 
 * Elemanlarýn ekleme sýrasý önemliyse ve Sorgulama iþlemlerinin hýzlý olmasý isteniyorsa
 * 
 * LinkedHashSet -> LinkedList ve HashSet implementasyonu gibi çalýþtýðý için deðerleri ekleme sýrasýna göre depolar. Ayrýca elemanlarý sorgulama çok hýzlýdýr ve sabit zamanda çalýþýr
 * 
 * Elemanlarýn sýrasý önemliyse
 * 
 * TreeSet -> Verileri aðaç yapýsýnda depoladýðý için veriler her zaman sýralýdýr. Ancak bir elemanýn var olup olmadýðýný sorgulama zamaný içindeki eleman sayýsýyla doðru orantýlýdýr. (O(logn))
 * 
 *Eðer kendi objelerimizi setlerde kullanmak istiyorsak hashCode() ve equals() metodlarýný override etmeliyiz.
 *
 *--------------------------------------------------------------------------------------------------------------------------------- 
 * 
 * Map Interface'ini implemente eden classlar
 * 
 * Veriler Anahtar Deðer iliþkisiyle depolanýr.
 * Bir key'e karþýlýk gelen yalnýzca bir deðer bulunur
 * Bir key birden fazla bulunamaz
 * Bir deðere bir key üzerinden eriþmek çok hýzlýdýr
 * Deðerlerin üzerinde tek tek gezinmek çok yavaþtýr
 * Eðer kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlarýný override etmeliyiz.
 * 
 * HashMap
 * Anahtarlar ve Deðerler sýralý deðildir.
 * 
 * LinkedHashMap
 * Anahtarlar ve Deðerler eklenme sýrasýna göre depolanýr.
 * 
 * TreeMap
 * Anahtarlar ve Deðerler "Anahtarlara göre" Sýralý depolanýr.
 * 
 * ---------------------------------------------------------------------------------------------------------------------------------
 * 
 * Queue Ýnterface'ini implemente eden classlar
 * 
 * LinkedList
 * Eðer Queue interface'inden bir referans ile LinkedList oluþturulursa bu linkedlist ayný zamanda bir Queue gibi davranýr
 * First in First Out (Ýlk gelen Ýlk çýkar mantýðýyla çalýþýr)
 * 
 * PrioritiyQueue
 * Queue interface'ini implemente etmesine raðmen First In First Out mantýðýyla çalýþmaz. Deðerler öncelik sýrasýna göre kuyruðun baþýna geçer
 * 
 * -----------------------------------------------------------------------------------------------------------------------------------
 * 
 * Vector Classýndan Extend eden Stackler
 * LIFO (Last in First Out Mantýðýyla çalýþýr) Bilgisayarlarda Recursif Fonksiyonlar çalýþýrken kullanýlýr
 * 
 * -----------------------------------------------------------------------------------------------------------------------------------
 * 
 * Kendi objelerimizle Oluþturduðumuz bir veri yapýsýný sýralamak
 * 
 * Collections.sort metoduyla kendi objelerimizile oluþturduðumuz bir veri yapýsýný sýralamak için ya Comparable interface'ini yada
 * Comparator interface'ini implemente etmek zorundayýz.
 * 
 * Comparable ile Comparator arasýndaki fark Comparable interface'ini implemente ederek 1 clasýmýzý sadece ve sadece tek bir yol ile sýralayabiliyorduk
 * yani ya küçükten büyüyüðe yada büyükten küçüðe yani tek bir yol ile sýralayabiliyorduk ancak Deðiþik comparator classlar oluþturarak
 * bir classýmýzý birden farklý yol ile direk olarak sýralayabiliyorduk
 * 
 * ----------------------------------------------------------------------------------------------------------------------------------------
 * 
 * Iteratorlar ve Itarable
 * Bir veri yapýsýnda iterator oluþturarak veri yapýsýnýn elemanlarý üzerinde kolayca gezinebiliriz
 * 
 * Aslýnda For Each Döngüsü kendi içinde iterator kullanýr
 * 
 * O yüzden bizim de bir classýmýzdan oluþturduðumuz objelerin üzerinde gezinebilmemiz için iterable sýnýfýný implemente etmemiz ve classýmýza ait bir tane iterator class yazmamýz gerekmektedir
 * 
 * 
 */
public class Driver {

}
