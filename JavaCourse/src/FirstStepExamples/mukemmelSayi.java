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
			System.out.println("M�kemmel say�d�r.");
		}
		else {
			System.out.println("M�kemmel say� de�ildir.");
		}
	}
}
