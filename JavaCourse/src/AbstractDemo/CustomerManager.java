package AbstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	
	public void getCustomer() {
		OracleDatabaseManager oracle = new 	OracleDatabaseManager();
		/*
		 * oracle.getData(); //bunu yaparsak classa ba��ml� hale geliriz.
		 */
		
		databaseManager.getData();
		
		//b�ylece bir ba��ml�l�ktan kurtulmu� olduk.
		 
	}
}
