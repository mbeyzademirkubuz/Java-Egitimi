package StaticDemo;

public class Main {

	public static void main(String[] args) {

/*
 * static yap�, . ile eri�im sa�lar. 
 * Nesne bir kere olu�ur ve herkes onu kullan�r. 
 */
	Product product = new Product();
	product.id= 1;
	product.name= "Mouse";
	product.price= 1000;
	ProductManager manager = new ProductManager();
	manager.add(product);

	}

}
