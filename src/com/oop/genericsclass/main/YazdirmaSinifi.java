package com.oop.genericsclass.main;
/*
 * <E> : Ben sana farkl� t�rlerden veri tipleri g�nderece�im ve sen g�nderdi�im veri tiplerini bu E yi kulland���n her yere yaz!...
 */
public class YazdirmaSinifi<E> {
	public void yazdir(E[] dizi) {
		for (E e : dizi) {
			System.out.println(e);
		}
	}
}
