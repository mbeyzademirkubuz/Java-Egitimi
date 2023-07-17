package Conditions;

public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("Passed!");
			break;
		case 'B':
		case 'C':
			System.out.println("Great! Passed");
			break;	
		case 'D':
			System.out.println("Fine. Passed!");
			break;
		case 'F':
			System.out.println("Fail!");
			break;
		default:
			System.out.println("Invalid note!");
		}
	}
}
