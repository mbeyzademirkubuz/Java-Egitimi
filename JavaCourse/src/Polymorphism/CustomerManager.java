package Polymorphism;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("eklendi.");
		this.logger.log("log mesajý");
		/*
		DatabaseLogger logger = new DatabaseLogger();   //class içerisinde class tanýmlamak tehlikelidir. Baðýmlý sistemler ortaya çýkar.
		*/
	}
}
