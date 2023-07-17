package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		try {
		int[] sayilar = new int [] {1,2,3};
		
		System.out.println(sayilar[5]);
		}
		catch(StringIndexOutOfBoundsException exception){   //exception parametredir. 
			System.out.println("Hata olu�tu.");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Hata olu�tu.");
		}
		catch(Exception exception) {
			System.out.println("Logland�" + exception);
		}
		finally {  //hata bulsa da bulmasa da �al���r. 
			System.out.println("Ben her t�rl� �al���r�m.");
		}
	}

}
