package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// "int i;" þeklinde tanýmlamak hataya yol açar. 
		//Baþlangýç deðeri vermen lazým.
		
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
