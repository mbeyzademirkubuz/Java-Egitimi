package Arrays;

public class reCapArray {
	public static void main(String[] args) {
	
	double[] mylist = {1.2, 1.3, 4.3, 5.6};
	double total=0;
	double max = mylist[0];
	
	for (double num : mylist) {
		
		if(max<num) {
			max= num;
		}
		total = total + num;
		System.out.println(num);
	}
	System.out.println("Total: " +total);
	System.out.println("\nMax value: " +max);
	
	
	}
}
