
package ArrayLists;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		System.out.println(sayilar.size());
		
		sayilar.add(3);
		sayilar.add(10);
		
		System.out.println(sayilar.size());
		
		sayilar.add("Ankara");   //bu de�eri de ekleyebiliriz arraylist olarak tan�mlad���m�z i�in.
		
		System.out.println(sayilar.get(2));  //index ile eleman bulma.
		
		sayilar.set(0, 100);  //0. indexteki eleman de�i�ti. 
		
		System.out.println(sayilar.get(0)); 
		
		sayilar.remove(0) ; //index bazl� silme i�lemi. Remove edilince ikinci eleman birinci eleman olur. Sola do�ru kayma mevcuttur. 
		
		sayilar.clear();  //t�m elemanlar silinir. 
		
		for(Object i :sayilar) {  //farkl� t�rde elemanlar oldu�u i�in int- string de�il object ile tan�mlar�z. 
			System.out.println(i);
		}
 
	}

}
