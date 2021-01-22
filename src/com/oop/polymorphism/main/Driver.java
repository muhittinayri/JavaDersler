package com.oop.polymorphism.main;
/*
 * Polymorphism = Bir nesnenin birden farkl� nesne gibi davranmas�d�r.
 * 
 * Polymorphism i�in bir tane ana class olmas� gerekiyor. Geri kalanlar alt classlar olmas� gerekiyor. Alt classdaki referanslar� superclass'daki referans'a e�itleyebiliyoruz. 
 * 
 * 
 * 
 */

class Hayvan {
	private String isim;

	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String konus() {
		return "Hayvan konu�uyor";
	}
}

class Kedi extends Hayvan {
	public Kedi(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		return this.getIsim() + " Miyavl�yor";
	}
}

class Kopek extends Hayvan {
	public Kopek(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		return this.getIsim() + " Havl�yor";
	}
}

class At extends Hayvan {
	public At(String isim) {
		super(isim);
	}

	@Override
	public String konus() {
		return this.getIsim() + " Ki�niyor";
	}

}



public class Driver {

	public static void konustur(Object object) {
//		System.out.println(hayvan.konus());

		if (object instanceof Kopek) {
			Kopek kopek = (Kopek) object;
			System.out.println(kopek.konus());
		}
		
		else if (object instanceof Kedi) {
			Kedi kedi = (Kedi) object;
			System.out.println(kedi.konus());
		}
		
		else if (object instanceof At) {
			At at = (At) object;
			System.out.println(at.konus());
		}
		
		else if (object instanceof Hayvan) {
			Hayvan hayvan = (Hayvan) object;
			System.out.println(hayvan.konus());
		}
	}

	public static void main(String[] args) {
		/*
		 * Hayvan hayvan = new Kedi("Tekir"); Hayvan hayvan2 = new Kopek("Luci"); Hayvan
		 * hayvan3 = new At("�ahbatur"); System.out.println(hayvan.konus());
		 * System.out.println(hayvan2.konus()); System.out.println(hayvan3.konus());
		 */

		// konustur(new Kedi("Tekir"));
		// konustur(new Kopek("Luci"));
		// konustur(new At("�ahbatur"));

		/*
		 * instanceof anahtar kelimesi ile bir obje verilir ve bu objenin hangi classdan
		 * oldu�unu belirtir.
		 * 
		 */

		Kopek kopek = new Kopek("Luci");
		Kedi kedi = new Kedi("Tekir");
		At at = new At("�ahbatur");
		Hayvan hayvan = new Hayvan("Hayvan");
		
		
		
		

	}
}
