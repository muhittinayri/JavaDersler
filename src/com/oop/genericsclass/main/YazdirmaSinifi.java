package com.oop.genericsclass.main;
/*
 * <E> : Ben sana farklı türlerden veri tipleri göndereceğim ve sen gönderdiğim veri tiplerini bu E yi kullandığın her yere yaz!...
 */
public class YazdirmaSinifi<E> {
	public void yazdir(E[] dizi) {
		for (E e : dizi) {
			System.out.println(e);
		}
	}
}
