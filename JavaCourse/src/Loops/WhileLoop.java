package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		//for d�ng�s�nde oldu�u gibi "int i<10" diye tan�mlanmaz.
		
		int i=1;
		while(i <10) {
			System.out.print(" " +i);
			i++;
		}
		System.out.println("\nLoop is over! \n");
		
		int e=0;
		while(e <10) {
			System.out.println("Even number is:" +e);
			e += 2;
		}
		System.out.println("Loop is over!");

	}

}
