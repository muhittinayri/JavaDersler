package com.oop.genericsclass.main;
/*
 * <E> : Ben sana farklý türlerden veri tipleri göndereceðim ve sen gönderdiðim veri tiplerini bu E yi kullandýðýn her yere yaz!...
 */
public class YazdirmaSinifi<E> {
	public void yazdir(E[] dizi) {
		for (E e : dizi) {
			System.out.println(e);
		}
	}
}
