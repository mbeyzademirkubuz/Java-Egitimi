package Classlar;

public class demo {

	public static void main(String[] args) {
		Classlar.Calculator Islem = new Calculator();
		int sonuc1, sonuc2, sonuc3, sonuc4;
		sonuc1= Islem.Topla(3, 4);
		sonuc2 = Islem.Cikar(6, 3);
		sonuc3= Islem.Carp(4, 5);
		sonuc4= Islem.Bol (10 ,2);
		
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);
		System.out.println(sonuc4);
		
	}

}
