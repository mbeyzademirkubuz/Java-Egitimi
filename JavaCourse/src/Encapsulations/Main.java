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
		 * bu i�lemi ba�ka ekranlarda tek tek �a��rd���n� d���n.
		 * Fonsiyonda ba�ka bir parametre daha eklemen gerekti�inde b�t�n ekranlarda tek tek de�i�im yapman gerekir.
		 * Buna engel olmak i�in Encapsulaiton kullan�l�r. 
		 */
		
		manager.Add2(1, null, null, 5); 
		
	
	}

}
