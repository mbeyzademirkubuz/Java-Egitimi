package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class TypeSafe {

	public static void main(String[] args) {
		ArrayList <String> sehirler = new ArrayList<String>();  // sadece string de�i�kenler olacak �ekilde tan�mland�. 
		
		sehirler.add("Ankara");
		sehirler.add("�stanbul");
		sehirler.add("Edirne");
		sehirler.add("Isparta");
		
		Collections.sort(sehirler);
		
		for (String sehir: sehirler) {
			System.out.println(sehir);
		}
		
	}

}
