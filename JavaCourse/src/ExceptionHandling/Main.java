package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		try {
		int[] sayilar = new int [] {1,2,3};
		
		System.out.println(sayilar[5]);
		}
		catch(StringIndexOutOfBoundsException exception){   //exception parametredir. 
			System.out.println("Hata oluþtu.");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Hata oluþtu.");
		}
		catch(Exception exception) {
			System.out.println("Loglandý" + exception);
		}
		finally {  //hata bulsa da bulmasa da çalýþýr. 
			System.out.println("Ben her türlü çalýþýrým.");
		}
	}

}
