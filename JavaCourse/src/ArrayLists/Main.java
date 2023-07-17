
package ArrayLists;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		
		System.out.println(sayilar.size());
		
		sayilar.add(3);
		sayilar.add(10);
		
		System.out.println(sayilar.size());
		
		sayilar.add("Ankara");   //bu deðeri de ekleyebiliriz arraylist olarak tanýmladýðýmýz için.
		
		System.out.println(sayilar.get(2));  //index ile eleman bulma.
		
		sayilar.set(0, 100);  //0. indexteki eleman deðiþti. 
		
		System.out.println(sayilar.get(0)); 
		
		sayilar.remove(0) ; //index bazlý silme iþlemi. Remove edilince ikinci eleman birinci eleman olur. Sola doðru kayma mevcuttur. 
		
		sayilar.clear();  //tüm elemanlar silinir. 
		
		for(Object i :sayilar) {  //farklý türde elemanlar olduðu için int- string deðil object ile tanýmlarýz. 
			System.out.println(i);
		}
 
	}

}
