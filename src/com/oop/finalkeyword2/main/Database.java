package com.oop.finalkeyword2.main;


//Bir class final olarak yaparsak ondan hiçbir alt sýnýf direk olarak üretemiyoruz.
//public final class Database {


public class Database {

	// Metotlarýmýz içerisinde deðiþtirilmesini istemediðimiz parametreler var ise
	// final olarak tanýmlamamýz gerekiyor.
	// public void baglantiKur(final String username, final String password) {

	// Metotlarda final anahtar kelimesini kullanýrsak ve daha sonrasýnda bu
	// classdan baþka bir class extends edilirse kesinlikle ve kesinlikle override
	// edilemez.
	// public final void baglantiKur(String username, String password) {

	public void baglantiKur(String username, String password) {

		System.out.println(username);
		System.out.println(password);
	}
}
