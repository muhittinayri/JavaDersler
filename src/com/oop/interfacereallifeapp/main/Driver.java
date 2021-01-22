package com.oop.interfacereallifeapp.main;

public class Driver {
	public static void main(String[] args) {
		SignUpManager manager = new SignUpManager(new ComplexUserCheckService());
		manager.signup(new User(1, "Muhittin", 23));
	}
}
