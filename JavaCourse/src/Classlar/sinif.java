package Classlar;

public class sinif {

	public static void main(String[] args) {
		
		//classlar reference tipindedir. 
		//Stack ve Heap yap�s� vard�r. Stack: CustomerManager Heap: customerManage
		/*
		 * Referans ile i�ler y�r�r. CustomerManager haf�zas�nda bir nesne olu�turuldu�unda o nesneyi i�aret eder. 
		 * Heap yap�s�nda da nesne, i�aret etti�i adrestedir. 
		 * Adres de�i�irse bazen iki Stack verisi bir heap verisine eri�ebilir.
		 * Herhangi bir referans� tutan bir nesne olmazsa garbage collector (��p toplay�c�) bellekten o nesneyi siler. 
		 */
		
		Classlar.CustomerManager customerManage = new CustomerManager();
		customerManage.Add();
		customerManage.Delete();
		customerManage.Update();
		
		
		//de�er tipindeki de�i�kenler stack i�erisindedir. 
		
		int sayi1= 10;
		int sayi2= 20;
		sayi2= sayi1;
		sayi1= 30;
		
		System.out.println(sayi2);
		
		//Dizilerde ayn� mant�k i�lemiyor. Diziler referans tiplidir.
		//Bu y�zden de�i�im g�zlemdi.
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {4,5,6};
		
		sayilar2= sayilar1;
		sayilar1[0]= 10;
		System.out.println(sayilar2[0]);
	}
	
	

}


