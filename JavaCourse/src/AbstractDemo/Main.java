package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager();
		//customer.getCustomer(); //bunu �al��t�r�rsak ortada bir new olmad��� i�in error al�r�z. 
		
		customer.databaseManager = new OracleDatabaseManager();
		customer.getCustomer();
		
		
		//Oracle kullananlar i�in Oracle class�, SQL kullananlar i�in de SQL getirilmi� oldu.Konfig�rasyonlar sa�land�.
		
		

	}

}
