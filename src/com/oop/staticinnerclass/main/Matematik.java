package com.oop.staticinnerclass.main;

public class Matematik {
	
	private static double PI = Math.PI;
	
	public static class Alan{
		
		//Static bir metot non-static olan bir varible'� direk olarak �a��ramaz!!!
		public static void daire_alan(int yaricap) {
			System.out.println("Dairenin alan� : " + (yaricap * yaricap) * PI);
		}
	}
}
