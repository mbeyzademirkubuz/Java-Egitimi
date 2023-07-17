package Polymorphism;   //çok biçimlilik

public class Poli {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesajý \n");
	
	
	BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};  //burada ekleme çýkarma yapýlabilir
	
	/*
	 * int [] sayilar = new int[] {1, 2, "beyz"} 
	 * Bunu yazamayýz çünkü string kabul etmez. Ama bu iþlem sýnýflarla oluþturulduðunda sorunsuz çalýþýr. Her biri farklý iþ yapýyor. 
	 */
	
	for (BaseLogger logg: loggers) {
		logg.log("Log mesajý");
	}
	
	
	
	CustomerManager customerManage = new CustomerManager (new DatabaseLogger()); 
		customerManage.add();
	}
}
