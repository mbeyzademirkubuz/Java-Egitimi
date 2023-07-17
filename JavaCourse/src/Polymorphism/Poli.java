package Polymorphism;   //�ok bi�imlilik

public class Poli {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesaj� \n");
	
	
	BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};  //burada ekleme ��karma yap�labilir
	
	/*
	 * int [] sayilar = new int[] {1, 2, "beyz"} 
	 * Bunu yazamay�z ��nk� string kabul etmez. Ama bu i�lem s�n�flarla olu�turuldu�unda sorunsuz �al���r. Her biri farkl� i� yap�yor. 
	 */
	
	for (BaseLogger logg: loggers) {
		logg.log("Log mesaj�");
	}
	
	
	
	CustomerManager customerManage = new CustomerManager (new DatabaseLogger()); 
		customerManage.add();
	}
}
