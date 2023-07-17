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
		System.out.println("Hesap: " +manager.getBalance());  //Çýktý olarak - aldýðý için yanlýþ bir iþlem aslýnda. 

	}
	
	/*
	 * throws kullanarak kendi hata mesajýmýzý consoleda görebilmiþ olduk.
	 */

}
