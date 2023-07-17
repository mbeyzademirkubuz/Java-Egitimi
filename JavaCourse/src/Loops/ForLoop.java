package Loops;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("Loop is over!");
		
		for(int i=0; i<10; i += 2) {
			System.out.println("Even numbers:" +i);
		}
		System.out.println("Loop is over!");
	}

}
