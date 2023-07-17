package FirstStepExamples;

public class AsalSayi {

	public static void main(String[] args) {
		int num = 22;
		int remainder = num % 2;
		System.out.println(remainder);
		
		boolean isPrime= true;
		
		if(num == 1) {
			System.out.print("Number is not prime!");
			return;
		}
		
		if(num > 1) {
			System.out.print("Invalid number!");
		}
		
		for (int i=2; i<num ; i++) {
			if(num % i == 0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.print("Number is prime.");
		}
		else {
			System.out.print("Number is not prime.");
		}
	}
}
