package FirstStepExamples;

public class ExampleTwo {

	public static void main(String[] args) {
		char harf = 'e';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kal�n sesli harf!");
				break;
			default:
				System.out.println("�nce sesli harf!");
		}

	}

}
