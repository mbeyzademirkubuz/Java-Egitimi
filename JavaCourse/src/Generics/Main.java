package Generics;

public class Main {

	public static void main(String[] args) {

		//ArrayList'ler gibi durumlarda Type Safe için Generic kullanýlýr. 
		
		MyList<Customer> sehirler = new MyList<Customer>();  //Generic yapý. 
		sehirler.add(new Customer());
		sehirler.add(new Customer());
		
	}

}
