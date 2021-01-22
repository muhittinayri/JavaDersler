package com.oop.collectionSortandComparable.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Listleri s�ralama ve kendi olu�turdu�umuz bir class� s�ralama
 */
//Javada kendi claslar�m�z�n i�erisindeki verileri kar��la�t�rmak i�in Comparable interfaceni kullanmam�z gerekiyor. �mplement etti�imizde compareTo metodunu override eder ve bu metodu istedi�imiz gibi yazabiliriz.

class Player implements Comparable<Player> {
	private String isim;
	private int id;

	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "|| Id : " + id + " �sim : " + isim + " ||";

	}

	@Override
	public int compareTo(Player player) {
		if (this.id < player.id) {
			return -1;
		}else if (this.id > player.id) {
			return 1;
		}
		return 0;
	}
}

public class Driver {
	public static void main(String[] args) {

		/*
		 * List<String> list_string = new ArrayList<String>();
		 * 
		 * list_string.add("Java"); list_string.add("C++"); list_string.add("Python");
		 * list_string.add("Php"); list_string.add("Go");
		 * 
		 * Collections.sort(list_string); for (String s : list_string) {
		 * System.out.println(s); }
		 */

		List<Player> player_list = new ArrayList<Player>();

		player_list.add(new Player("Murat", 5));
		player_list.add(new Player("Emre", 1));
		player_list.add(new Player("O�uz", 10));
		player_list.add(new Player("Muhittin", 4));
		
		Player player1 = new Player("Murat", 5);
		Player player2 = new Player("Yusuf", 4);
		//System.out.println(player1.compareTo(player2));
		
		/*Collections.sort(player_list);  S�ralama
		
		for (Player p : player_list) {
			System.out.println(p);
		}
		*/
		
		
		Set<Player> treeset = new TreeSet<Player>();
		treeset.add(new Player("Murat", 5));
		treeset.add(new Player("Emre", 1));
		treeset.add(new Player("O�uz", 10));
		treeset.add(new Player("Yusuf", 4));
		
		for (Player p : treeset) {
			System.out.println(p);
		}
	}
}
