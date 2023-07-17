package Polymorphism;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("eklendi.");
		this.logger.log("log mesaj�");
		/*
		DatabaseLogger logger = new DatabaseLogger();   //class i�erisinde class tan�mlamak tehlikelidir. Ba��ml� sistemler ortaya ��kar.
		*/
	}
}
