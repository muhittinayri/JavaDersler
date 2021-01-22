package com.oop.ExceptionFinally.main;
/*
 * Finally Blo�u exception olu�sada, olu�masada mutlaka �al���r.
 * 
 */
public class Driver {
	public static void main(String[] args) {
		try {
			//String s = null;
			String s = "Muhittin";
			System.out.println(s.hashCode());
			
		} catch (NullPointerException e) {
			System.out.println("Null Referans Hatas�...");
		}finally {
			System.out.println("Finally Blo�u �al���yor...");
		}
	}
}
