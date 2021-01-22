package com.oop.CollectionGenelTekrar.main;
/*
 * List Interface'i implemente eden Classlar.
 * 
 * Elementleri liste halinde depolar
 * Bir elemen birden fazla bulunabilir
 * Elementler indeks ile tutulur
 * Elementler eklenme s�ras�n� korur
 * Bir eleman� aramak �ok yava�t�r
 * Bir elemana indeks de�eri ile ula�mak h�zl�d�r
 * Listeler Collections.sort() metoduyla s�ralanabilir
 * 
 * 
 * Thread ��lemlerinde Kullanabilecek Veri Yap�s�
 * 
 * Vectorler -> ��nk� baz� metodlar� "Synchronized" anahtar kelimesiyle yaz�lm��t�r.
 * 
 * Elemanlar� sadece sona ekledi�imiz durumlarda
 * 
 * ArrayList -> ��nk� sadece sona eklemek arraylistlerde daha h�zl�d�r.
 * 
 * 
 * Eleman� Ortalara Ekleyece�imiz Durumlar Varsa
 * 
 * LinkedList -> ��nk� sadece o b�lgenin referanslar� �zerinde i�lem yap�l�r.
 * 
 * -----------------------------------------------------------------------------------------------------------------------------
 * 
 * Set Interface'inin implemente eden classlar
 * 
 * Bir eleman� sadece bir defa depolar.
 * Bir eleman�n sadece bir defa depolanmas�n� istiyorsak listler(ArrayList,LinkedList, vs) yerine kullan�labilir.
 * Elemanlar listler gibi indekslenmezler
 * Bir eleman� setlerde olup olmad���n� sorgulama listlere g�re olduk�a h�zl�d�r.
 * 
 * Elemanlar�n S�ras� �nemli de�ilse ve sorgulama i�lerinin h�zl� olmas� isteniyorsa
 * 
 * HashSet -> Elemanlar� ekleme s�ras�na g�re depolamaz ve bir eleman�n olup olmad���n� sorgulama hash fonksiyonuyla yap�ld��� i�in her zaman h�zl�
 * ve sabit zamanda �al���r.
 * 
 * Elemanlar�n ekleme s�ras� �nemliyse ve Sorgulama i�lemlerinin h�zl� olmas� isteniyorsa
 * 
 * LinkedHashSet -> LinkedList ve HashSet implementasyonu gibi �al��t��� i�in de�erleri ekleme s�ras�na g�re depolar. Ayr�ca elemanlar� sorgulama �ok h�zl�d�r ve sabit zamanda �al���r
 * 
 * Elemanlar�n s�ras� �nemliyse
 * 
 * TreeSet -> Verileri a�a� yap�s�nda depolad��� i�in veriler her zaman s�ral�d�r. Ancak bir eleman�n var olup olmad���n� sorgulama zaman� i�indeki eleman say�s�yla do�ru orant�l�d�r. (O(logn))
 * 
 *E�er kendi objelerimizi setlerde kullanmak istiyorsak hashCode() ve equals() metodlar�n� override etmeliyiz.
 *
 *--------------------------------------------------------------------------------------------------------------------------------- 
 * 
 * Map Interface'ini implemente eden classlar
 * 
 * Veriler Anahtar De�er ili�kisiyle depolan�r.
 * Bir key'e kar��l�k gelen yaln�zca bir de�er bulunur
 * Bir key birden fazla bulunamaz
 * Bir de�ere bir key �zerinden eri�mek �ok h�zl�d�r
 * De�erlerin �zerinde tek tek gezinmek �ok yava�t�r
 * E�er kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlar�n� override etmeliyiz.
 * 
 * HashMap
 * Anahtarlar ve De�erler s�ral� de�ildir.
 * 
 * LinkedHashMap
 * Anahtarlar ve De�erler eklenme s�ras�na g�re depolan�r.
 * 
 * TreeMap
 * Anahtarlar ve De�erler "Anahtarlara g�re" S�ral� depolan�r.
 * 
 * ---------------------------------------------------------------------------------------------------------------------------------
 * 
 * Queue �nterface'ini implemente eden classlar
 * 
 * LinkedList
 * E�er Queue interface'inden bir referans ile LinkedList olu�turulursa bu linkedlist ayn� zamanda bir Queue gibi davran�r
 * First in First Out (�lk gelen �lk ��kar mant���yla �al���r)
 * 
 * PrioritiyQueue
 * Queue interface'ini implemente etmesine ra�men First In First Out mant���yla �al��maz. De�erler �ncelik s�ras�na g�re kuyru�un ba��na ge�er
 * 
 * -----------------------------------------------------------------------------------------------------------------------------------
 * 
 * Vector Class�ndan Extend eden Stackler
 * LIFO (Last in First Out Mant���yla �al���r) Bilgisayarlarda Recursif Fonksiyonlar �al���rken kullan�l�r
 * 
 * -----------------------------------------------------------------------------------------------------------------------------------
 * 
 * Kendi objelerimizle Olu�turdu�umuz bir veri yap�s�n� s�ralamak
 * 
 * Collections.sort metoduyla kendi objelerimizile olu�turdu�umuz bir veri yap�s�n� s�ralamak i�in ya Comparable interface'ini yada
 * Comparator interface'ini implemente etmek zorunday�z.
 * 
 * Comparable ile Comparator aras�ndaki fark Comparable interface'ini implemente ederek 1 clas�m�z� sadece ve sadece tek bir yol ile s�ralayabiliyorduk
 * yani ya k���kten b�y�y��e yada b�y�kten k����e yani tek bir yol ile s�ralayabiliyorduk ancak De�i�ik comparator classlar olu�turarak
 * bir class�m�z� birden farkl� yol ile direk olarak s�ralayabiliyorduk
 * 
 * ----------------------------------------------------------------------------------------------------------------------------------------
 * 
 * Iteratorlar ve Itarable
 * Bir veri yap�s�nda iterator olu�turarak veri yap�s�n�n elemanlar� �zerinde kolayca gezinebiliriz
 * 
 * Asl�nda For Each D�ng�s� kendi i�inde iterator kullan�r
 * 
 * O y�zden bizim de bir class�m�zdan olu�turdu�umuz objelerin �zerinde gezinebilmemiz i�in iterable s�n�f�n� implemente etmemiz ve class�m�za ait bir tane iterator class yazmam�z gerekmektedir
 * 
 * 
 */
public class Driver {

}
