package com.oop.finalkeyword2.main;


//Bir class final olarak yaparsak ondan hi�bir alt s�n�f direk olarak �retemiyoruz.
//public final class Database {


public class Database {

	// Metotlar�m�z i�erisinde de�i�tirilmesini istemedi�imiz parametreler var ise
	// final olarak tan�mlamam�z gerekiyor.
	// public void baglantiKur(final String username, final String password) {

	// Metotlarda final anahtar kelimesini kullan�rsak ve daha sonras�nda bu
	// classdan ba�ka bir class extends edilirse kesinlikle ve kesinlikle override
	// edilemez.
	// public final void baglantiKur(String username, String password) {

	public void baglantiKur(String username, String password) {

		System.out.println(username);
		System.out.println(password);
	}
}
