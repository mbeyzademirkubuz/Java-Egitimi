package AbstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	
	public void getCustomer() {
		OracleDatabaseManager oracle = new 	OracleDatabaseManager();
		/*
		 * oracle.getData(); //bunu yaparsak classa baðýmlý hale geliriz.
		 */
		
		databaseManager.getData();
		
		//böylece bir baðýmlýlýktan kurtulmuþ olduk.
		 
	}
}
