package ExceptionHandling;

public class MainDemo {

	public static void main(String[] args) throws Exception {
		AccountManager manager = new AccountManager();
		System.out.println("Hesap: " +manager.getBalance());
		manager.deposit(100);
		System.out.println("Hesap: " +manager.getBalance());
		manager.withdraw(90);
		System.out.println("Hesap: " +manager.getBalance());
		manager.withdraw(20);
		System.out.println("Hesap: " +manager.getBalance());  //��kt� olarak - ald��� i�in yanl�� bir i�lem asl�nda. 

	}
	
	/*
	 * throws kullanarak kendi hata mesaj�m�z� consoleda g�rebilmi� olduk.
	 */

}
