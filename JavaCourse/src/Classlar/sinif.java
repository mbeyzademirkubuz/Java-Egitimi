package Classlar;

public class sinif {

	public static void main(String[] args) {
		
		//classlar reference tipindedir. 
		//Stack ve Heap yapısı vardır. Stack: CustomerManager Heap: customerManage
		/*
		 * Referans ile işler yürür. CustomerManager hafızasında bir nesne oluşturulduğunda o nesneyi işaret eder. 
		 * Heap yapısında da nesne, işaret ettiği adrestedir. 
		 * Adres değişirse bazen iki Stack verisi bir heap verisine erişebilir.
		 * Herhangi bir referansı tutan bir nesne olmazsa garbage collector (çöp toplayıcı) bellekten o nesneyi siler. 
		 */
		
		Classlar.CustomerManager customerManage = new CustomerManager();
		customerManage.Add();
		customerManage.Delete();
		customerManage.Update();
		
		
		//değer tipindeki değişkenler stack içerisindedir. 
		
		int sayi1= 10;
		int sayi2= 20;
		sayi2= sayi1;
		sayi1= 30;
		
		System.out.println(sayi2);
		
		//Dizilerde aynı mantık işlemiyor. Diziler referans tiplidir.
		//Bu yüzden değişim gözlemdi.
		
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = {4,5,6};
		
		sayilar2= sayilar1;
		sayilar1[0]= 10;
		System.out.println(sayilar2[0]);
	}
	
	

}


