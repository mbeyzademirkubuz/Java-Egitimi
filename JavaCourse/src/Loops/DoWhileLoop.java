package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// "int i;" �eklinde tan�mlamak hataya yol a�ar. 
		//Ba�lang�� de�eri vermen laz�m.
		
		int i =0 ;

		do {
			System.out.print(" " + i);
			i++;
		}
		while (i<10);
		
		int e = 0;
		
		do {
			System.out.println("\nEven number is: " + e);
			e+=2;
		}
		while(e<10);

}
}
