package com.oop.staticinnerclass.main;

public class Matematik {
	
	private static double PI = Math.PI;
	
	public static class Alan{
		
		//Static bir metot non-static olan bir varible'ý direk olarak çaðýramaz!!!
		public static void daire_alan(int yaricap) {
			System.out.println("Dairenin alaný : " + (yaricap * yaricap) * PI);
		}
	}
}
