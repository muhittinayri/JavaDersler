package com.oop.foreach.main;

public class Driver {
	public static void main(String[] args) {
		//Foreach döngüsü pratik bir yöntemdir
		
		String[] array = {"Elma","Armut","Kiraz"};
		int[] array2 = {1,2,3,4,5,6,7};
		Deneme[] deneme = {new Deneme("Muti"),new Deneme("Memo"),new Deneme("Ali")};
		
		for (Deneme a : deneme) {
			a.yaz();
		}
		
		for (int i : array2) {
			System.out.println(i);
		}
		
		for (String a : array) {
			System.out.println(a);
		}
		
	}
}
