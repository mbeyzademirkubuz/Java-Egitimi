package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager();
		//customer.getCustomer(); //bunu çalýþtýrýrsak ortada bir new olmadýðý için error alýrýz. 
		
		customer.databaseManager = new OracleDatabaseManager();
		customer.getCustomer();
		
		
		//Oracle kullananlar için Oracle classý, SQL kullananlar için de SQL getirilmiþ oldu.Konfigürasyonlar saðlandý.
		
		

	}

}
