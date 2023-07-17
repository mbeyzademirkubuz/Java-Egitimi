package ArrayLists;

import java.util.*;

public class MainCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1, "Beyza", "Demirkubuz"));
		customers.add(new Customer(2, "Arif", "Kiraz"));
		
		for (Customer i : customers) {
			System.out.println(i);
		}
		

	}

}
