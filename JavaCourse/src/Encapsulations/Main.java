package Encapsulations;

public class Main {

	public static void main(String[] args) {
		Products product = new Products();
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus");
		product.set_stockAmount(2);
		product.set_price(1000);
		
		ProductManager manager = new ProductManager();
		manager.Add(product);
		
		/* 
		 * bu iþlemi baþka ekranlarda tek tek çaðýrdýðýný düþün.
		 * Fonsiyonda baþka bir parametre daha eklemen gerektiðinde bütün ekranlarda tek tek deðiþim yapman gerekir.
		 * Buna engel olmak için Encapsulaiton kullanýlýr. 
		 */
		
		manager.Add2(1, null, null, 5); 
		
	
	}

}
