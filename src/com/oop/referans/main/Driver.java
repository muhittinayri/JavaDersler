package com.oop.referans.main;

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account("Muhittin AYRI","ayri.muhittin@gmail.com","12345678910");
		/*
		 * Bir account s�n�f� olu�turuyoruz. Daha sonra bu account s�n�f�ndan bir tane account objesi olu�turuyoruz.
		 * Bunu new Account ile yap�yoruz. daha sonra new Account() �eklindeki ifade bize Account clas�ndan bir referans
		 * ��kt�s� veriyor. Ve bizde bu ��kt�y� bir referans'a e�itliyoruz(account1)
		 * 
		 */
		
		Account account2 = account1; //�ki referansda ayn� yeri g�sterir. �kisinin bir fark� yoktur.
		
		
	}
}
