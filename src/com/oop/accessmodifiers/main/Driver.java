package com.oop.accessmodifiers.main;

public class Driver {
	
	/*
	 * Access Modifiers = Eri�im Belirleyiciler
	 * 
	 * Eri�im belirleyiciler 2 d�zeyde eri�im belirlerler.
	 * 
	 * --S�n�f D�zeyinde Eri�im Belirleyiciler--
	 * 
	 * public : Bir class e�er public yaz�lm��sa bu classa paketin i�indeki ve paketin d���ndaki t�m classlar taraf�ndan eri�ilir.
	 * 
	 * default : defaul eri�im belileyici kullanmamak anlam�na gelir.
	 * E�er bir class hi�bir eri�im belirleyici kullanmadan yaz�lm��sa, bu class'a sadece ayn� paketin i�indeki classlar eri�ebilir. Paketin d���ndaki classlar bu class'a eri�emez.
	 * 
	 * **protected ve private eri�im belirleyiciler classlar i�in kullan�lamazlar.
	 */
	
	
	/*
	 * Metod ve �zellik d�zeyinde eri�im belirleyiciler
	 * 
	 * public : E�er bir metod veya �zellik(class member veya alan) public olarak tan�mlanm��sa bu alana paketin i�indeki ve d���ndaki t�m classlar eri�ebilir.
	 * Ancak tabi ki bu alan�n i�inde bulundu�u class�n da eri�ebilir olmas� gerekir.
	 * 
	 * 
	 * default : E�er bir metod ve ya �zellik tanm�mlan�rken hi�bir eri�im belirleyici kullan�lmam��sa(default), bu alana sadece kendi paketindeki 
	 * classlar eri�ebilir.
	 * 
	 * protected : E�er bir metod veya �zellik(class member veya alan) protected olarak tan�mlanm�sa, bu alana ayn� paketin i�indeki di�er classlar taraf�ndan eri�ebilir. 
	 * paketin d���ndaki classlar ise sadece ve sadece bu alan�n bulundu�u claass�n bir alt class�yla eri�ilebilir
	 * 
	 * private : E�er bir alan private olarak tan�mlanm��sa bu alana sadece kendi class� eri�ebilir
	 * 
	 * Daha �nceden ��rendi�imiz gibi bir metodun i�ine tan�mlanm�� de�i�kenler lokal de�i�ken olarak ten�mlan�rlar. Yani bu de�i�kenlere di�er metodlardan ve classlardan eri�ilemez. Bundan
	 * dolay� bu de�i�kenlere access modifier eklenmez..
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
	}
}
