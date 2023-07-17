package StaticDemo;

public class Main {

	public static void main(String[] args) {

/*
 * static yapý, . ile eriþim saðlar. 
 * Nesne bir kere oluþur ve herkes onu kullanýr. 
 */
	Product product = new Product();
	product.id= 1;
	product.name= "Mouse";
	product.price= 1000;
	ProductManager manager = new ProductManager();
	manager.add(product);

	}

}
