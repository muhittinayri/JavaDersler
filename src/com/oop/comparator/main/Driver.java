package com.oop.comparator.main;
/*
 * Comparable ve Comprator arasýndaki fark comparator kullanarak bir tane listemizi farklý yollardan sýralayabiliyoruz. Ancak Comparable interface'ini
 * implemente edersek sadece bir tane metot yazýyoruz ve o listemiz sadece o þekilde çalýþýyor ve bu þekilde de biz tek bir yol ile listelemiþ oluyoruz.
 * Ancak deðiþik comparator interface'ini implemente eden classlar yazar isek bir obje üzerinde bir tane class üzerinde deðiþik sýralama iþlemleri 
 * yapabiliyoruz.
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class BuyuktenKucugeString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// Stringlerin içerisinde compareTo metodumuz var ve bu compareTo metodumuz o1
		// o2 den küçük ise -(eksi) bir deðer döndürüyor. o1 ve o2 eþitse 0 (sýfýr)
		// deðer döndürüyor. o1 o2 den büyükse + (artý) bir deðer döndürüyor.
		// Büyükten küçüðe sýralamak istediðimiz için baþýna - deðeri veriyoruz.

		return -o1.compareTo(o2);
	}
}

class KucuktenBuyugeString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// Stringlerin içerisinde compareTo metodumuz var ve bu compareTo metodumuz o1
		// o2 den küçük ise -(eksi) bir deðer döndürüyor. o1 ve o2 eþitse 0 (sýfýr)
		// deðer döndürüyor. o1 o2 den büyükse + (artý) bir deðer döndürüyor.
		// Küçükten büyüðe sýralamak istediðimiz için baþýna - deðeri vermiyoruz.

		return o1.compareTo(o2);
	}
}

class KucuktenBuyugePlayer implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		}
		return 0;
	}

}

class BuyuktenKucugePlayer implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		if (o1.getId() < o2.getId()) {
			return 1;
		} else if (o1.getId() > o2.getId()) {
			return -1;
		}
		return 0;
	}

}

class KucuktenBuyugeStringPlayer implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return o1.getIsim().compareTo(o2.getIsim());
	}
	
}



/*
 * Listleri sýralama ve kendi oluþturduðumuz bir classý sýralama
 */
//Javada kendi claslarýmýzýn içerisindeki verileri karþýlaþtýrmak için Comparable interfaceni kullanmamýz gerekiyor. Ýmplement ettiðimizde compareTo metodunu override eder ve bu metodu istediðimiz gibi yazabiliriz.

class Player implements Comparable<Player> {
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
	public int compareTo(Player player) {
		if (this.id < player.id) {
			return -1;
		} else if (this.id > player.id) {
			return 1;
		}
		return 0;
	}

	/**
	 * @return the isim
	 */
	public String getIsim() {
		return isim;
	}

	/**
	 * @param isim the isim to set
	 */
	public void setIsim(String isim) {
		this.isim = isim;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}

public class Driver {
	public static void main(String[] args) {

//		List<String> list_string = new ArrayList<String>();
//
//		list_string.add("Java");
//		list_string.add("C++");
//		list_string.add("Python");
//		list_string.add("Php");
//		list_string.add("Go");
//
//		// Sýralama
//		// Collections.sort(list_string, new KucuktenBuyugeString());
//
//		for (String s : list_string) {
//			System.out.println(s);
//		}

		List<Player> player_list = new ArrayList<Player>();

		player_list.add(new Player("Murat", 5));
		player_list.add(new Player("Emre", 1));
		player_list.add(new Player("Oðuz", 10));
		player_list.add(new Player("Muhittin", 4));
		
		
		
		
		Player player1 = new Player("Murat", 5);
		Player player2 = new Player("Yusuf", 4);
		
		
//		Collections.sort(player_list, new BuyuktenKucugePlayer());
		//Collections.sort(player_list, new KucuktenBuyugeStringPlayer());
		
		//Anonim class -- Büyükten küçüðe sýralar
		Collections.sort(player_list, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				return -o1.getIsim().compareTo(o2.getIsim());
						
			}
		});
		
		for (Player p : player_list) {
			System.out.println(p);
		}
		
//		//System.out.println(player1.compareTo(player2));
//		
//		/*Collections.sort(player_list);
//		
//		for (Player p : player_list) {
//			System.out.println(p);
//		}
//		*/
//		
//		
//		Set<Player> treeset = new TreeSet<Player>();
//		treeset.add(new Player("Murat", 5));
//		treeset.add(new Player("Emre", 1));
//		treeset.add(new Player("Oðuz", 10));
//		treeset.add(new Player("Yusuf", 4));
//		
//		for (Player p : treeset) {
//			System.out.println(p);
//		}
	}
}
