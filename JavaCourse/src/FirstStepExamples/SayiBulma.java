package FirstStepExamples;

public class SayiBulma {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int search = 5;
		
		boolean exist = false;
		
		for(int num: numbers) {
			if(num == search) {
				exist = true;
				break;
			}
		}
		if(exist) {
		System.out.println("Number that you search is exist in Numbers.");
		}
		else {
			System.out.println("Number that you search isn't exist in Numbers.");
		}
	}

}
