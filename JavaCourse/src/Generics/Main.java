package Generics;

public class Main {

	public static void main(String[] args) {

		//ArrayList'ler gibi durumlarda Type Safe i�in Generic kullan�l�r. 
		
		MyList<Customer> sehirler = new MyList<Customer>();  //Generic yap�. 
		sehirler.add(new Customer());
		sehirler.add(new Customer());
		
	}

}
