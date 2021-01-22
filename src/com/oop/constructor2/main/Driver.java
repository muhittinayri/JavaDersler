package com.oop.constructor2.main;

import com.oop.constructor2.main.Account;

public class Driver {
	public static void main(String[] args) {
		Account account = new Account();
		//System.out.println(account.getEmail());
		Account account2 = new Account("Ahmet Can","example@gmail.com","79789897464");
		/*System.out.println(account2.getEmail());
		System.out.println(account2.getBakiye());
		System.out.println(account2.getHesapNo());*/
		
		account2.bilgileriGoster();
	}
}
