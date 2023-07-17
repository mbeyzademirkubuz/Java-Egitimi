package FirstStepExamples;

public class mukemmelSayi {
	public static void main(String[] args) {
		int num = 5;
		
		int total = 0;
		
		for(int i=1; i<num ; i++) {
			if(num % i==0) {
				total= total+i;
			}
		}
		if(total== num) {
			System.out.println("Mükemmel sayýdýr.");
		}
		else {
			System.out.println("Mükemmel sayý deðildir.");
		}
	}
}
