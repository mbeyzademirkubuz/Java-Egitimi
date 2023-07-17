package Arrays;

public class array {

	public static void main(String[] args) {
		
		String [] students = new String[3];
		students[0] = "Beyza";
		students[1] = "Manolya";
		students[2] = "Elfida";
		
		for (int i=0; i<students.length; i++) {
			System.out.println("" +(i+1) + ". student is: " +students[i]);
		}
		
		for (String student: students) { //Students arrayini tek tek gezer.
			System.out.println("\n" + student);
		}
		

	}

}
