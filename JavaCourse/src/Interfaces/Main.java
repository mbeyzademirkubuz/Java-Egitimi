package Interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager(new OracleCustomerDal());
		
		customer.add();

	}

}
