package com.oop.referans.main;

public class Driver {
	public static void main(String[] args) {
		Account account1 = new Account("Muhittin AYRI","ayri.muhittin@gmail.com","12345678910");
		/*
		 * Bir account sýnýfý oluþturuyoruz. Daha sonra bu account sýnýfýndan bir tane account objesi oluþturuyoruz.
		 * Bunu new Account ile yapýyoruz. daha sonra new Account() þeklindeki ifade bize Account clasýndan bir referans
		 * çýktýsý veriyor. Ve bizde bu çýktýyý bir referans'a eþitliyoruz(account1)
		 * 
		 */
		
		Account account2 = account1; //Ýki referansda ayný yeri gösterir. Ýkisinin bir farký yoktur.
		
		
	}
}
