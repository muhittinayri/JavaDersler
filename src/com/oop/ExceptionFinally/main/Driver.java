package com.oop.ExceptionFinally.main;
/*
 * Finally Bloðu exception oluþsada, oluþmasada mutlaka çalýþýr.
 * 
 */
public class Driver {
	public static void main(String[] args) {
		try {
			//String s = null;
			String s = "Muhittin";
			System.out.println(s.hashCode());
			
		} catch (NullPointerException e) {
			System.out.println("Null Referans Hatasý...");
		}finally {
			System.out.println("Finally Bloðu Çalýþýyor...");
		}
	}
}
