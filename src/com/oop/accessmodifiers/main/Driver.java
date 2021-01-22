package com.oop.accessmodifiers.main;

public class Driver {
	
	/*
	 * Access Modifiers = Eriþim Belirleyiciler
	 * 
	 * Eriþim belirleyiciler 2 düzeyde eriþim belirlerler.
	 * 
	 * --Sýnýf Düzeyinde Eriþim Belirleyiciler--
	 * 
	 * public : Bir class eðer public yazýlmýþsa bu classa paketin içindeki ve paketin dýþýndaki tüm classlar tarafýndan eriþilir.
	 * 
	 * default : defaul eriþim belileyici kullanmamak anlamýna gelir.
	 * Eðer bir class hiçbir eriþim belirleyici kullanmadan yazýlmýþsa, bu class'a sadece ayný paketin içindeki classlar eriþebilir. Paketin dýþýndaki classlar bu class'a eriþemez.
	 * 
	 * **protected ve private eriþim belirleyiciler classlar için kullanýlamazlar.
	 */
	
	
	/*
	 * Metod ve Özellik düzeyinde eriþim belirleyiciler
	 * 
	 * public : Eðer bir metod veya özellik(class member veya alan) public olarak tanýmlanmýþsa bu alana paketin içindeki ve dýþýndaki tüm classlar eriþebilir.
	 * Ancak tabi ki bu alanýn içinde bulunduðu classýn da eriþebilir olmasý gerekir.
	 * 
	 * 
	 * default : Eðer bir metod ve ya özellik tanmýmlanýrken hiçbir eriþim belirleyici kullanýlmamýþsa(default), bu alana sadece kendi paketindeki 
	 * classlar eriþebilir.
	 * 
	 * protected : Eðer bir metod veya özellik(class member veya alan) protected olarak tanýmlanmýsa, bu alana ayný paketin içindeki diðer classlar tarafýndan eriþebilir. 
	 * paketin dýþýndaki classlar ise sadece ve sadece bu alanýn bulunduðu claassýn bir alt classýyla eriþilebilir
	 * 
	 * private : Eðer bir alan private olarak tanýmlanmýþsa bu alana sadece kendi classý eriþebilir
	 * 
	 * Daha önceden öðrendiðimiz gibi bir metodun içine tanýmlanmýþ deðiþkenler lokal deðiþken olarak tenýmlanýrlar. Yani bu deðiþkenlere diðer metodlardan ve classlardan eriþilemez. Bundan
	 * dolayý bu deðiþkenlere access modifier eklenmez..
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
	}
}
