package Polymorphism;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged database:" + message);
	}
}
