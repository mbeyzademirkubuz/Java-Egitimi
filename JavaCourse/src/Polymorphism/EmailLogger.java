package Polymorphism;

public class EmailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged Email:" + message);
	}
}
