package com.oop.cokboyutluarray.main;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		//int[] array =  {1,2,3,4,5,6};
		
		//int[][] array2 = new int[2][2]; //Çok boyutlu array 2boyutlu array
		/*
		array2[0][0] = 10; //0.satırın 0. sütununa 10 değeri eklenir
		array2[0][1] = 20;
		array2[1][0] = 30;
		array2[1][1] = 40;*/
		
		/*int[][] array2 =  {{10,20},{30,40}}; //2 boyutlu array
		System.out.println(array2[0][1]);
		System.out.println(array2[1][1]);*/
		
		int[][] array2 = new int[2][2]; 
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array2[i][j] = scanner.nextInt();
			}
		}
		System.out.println("******************************************");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}
