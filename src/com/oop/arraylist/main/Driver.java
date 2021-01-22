package com.oop.arraylist.main;

import java.util.ArrayList;

public class Driver {
	
	public static void yazdir(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println("Element : " + (i+1) + " : " + a.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>(); //ArrayList olu�turma
		
		arraylist.add("Metallica");
		arraylist.add("Guns'n Roses");
		arraylist.add("Black Sabbath");
		arraylist.add("Iron Maiden");
		arraylist.add("Megadeth");
		
		//System.out.println(arraylist.get(0));  //0. indexdeki de�eri getirir.
		
		//System.out.println(arraylist.size()); //Arraylist boyunu al�r
		
		//arraylist.remove("Metallica");  //De�eri ��kar�r
		//arraylist.remove(1); // 1. indexdeki eleman� ��kar�r
		
		/*System.out.println(arraylist.indexOf("Metallica"));  //Arat�lan de�er olmaz ise -1 d�ner
		System.out.println(arraylist.lastIndexOf("Metallica"));*/
		
		
		//arraylist.set(4, "Megadeth");	//Arraylist g�ncellenir.
		
		
		/*
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}*/
		
		
		yazdir(arraylist);

		
	}
	
			
}
