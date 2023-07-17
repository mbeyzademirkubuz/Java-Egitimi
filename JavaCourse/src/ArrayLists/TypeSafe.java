package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class TypeSafe {

	public static void main(String[] args) {
		ArrayList <String> sehirler = new ArrayList<String>();  // sadece string deðiþkenler olacak þekilde tanýmlandý. 
		
		sehirler.add("Ankara");
		sehirler.add("Ýstanbul");
		sehirler.add("Edirne");
		sehirler.add("Isparta");
		
		Collections.sort(sehirler);
		
		for (String sehir: sehirler) {
			System.out.println(sehir);
		}
		
	}

}
