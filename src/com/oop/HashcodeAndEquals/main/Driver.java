package com.oop.HashcodeAndEquals.main;

/*
 * Javada kendi oluþturduðumuz classda eðer biz hashcode ve equals metotlarýný yazmazsak java bu 2 tane objenin direk olarak ayný olduðunu anlayamayacak
 * 
 * Set<String> hashSet = new HashSet<String>(); olsaydý stringin içinde hashcode ve equals tanýmlý olduðu için ekstra tanýmlamaya gerek yoktur
 * 
 * 
 */

import java.util.HashSet;
import java.util.Set;

class Player {
	private String isim;
	private int id;

	public Player(String isim, int id) {
		this.isim = isim;
		this.id = id;
	}

	@Override
	public String toString() {
		return "|| Id : " + id + " Ýsim : " + isim + " ||";
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}

	
	
	
	
}

public class Driver {

	public static void main(String[] args) {
		Set<Player> hashSet = new HashSet<Player>();

		/*
		 * hashSet.add("Java"); hashSet.add("Python"); hashSet.add("C++");
		 * //hashSet.add("C++"); Bir elemaný sadece bir defa depolar
		 * 
		 * for (String s : hashSet) { System.out.println(s); }
		 */

		Player player1 = new Player("Muhittin", 1);
		Player player2 = new Player("Mehmet", 10);
		Player player3 = new Player("Emre", 6);
		Player player4 = new Player("Muhittin", 1);

		hashSet.add(player1);
		hashSet.add(player2);
		hashSet.add(player3);
		hashSet.add(player4);

		for (Player player : hashSet) {
			System.out.println(player);
		}

	}
}
