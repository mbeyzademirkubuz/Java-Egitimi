package Methods;

public class voidOperation {

	public static void main(String[] args) {
		String mes = "Bugün hava çok güzel";
		String newMes = mes.substring(0,2); //substring bir deðer döndürür. Bir arg girmelisin.
		System.out.println(newMes);
		
		/*
		  
		  String mess = ekle(); //Bu iþlem yapýlamaz çünkü fonksiyon void'dir. Bir deðiþkene atanamaz.
		 
		 */
		
		int sum= topla(5,6);
		System.out.println("Toplam: " +sum);
		
		int sum2= topla2(5,6,7,8,9);
		System.out.println("Toplam: " +sum2);
	}
	public static void ekle() {
		System.out.println("Eklendi.");
		
	}
	public static void sil() {
		System.out.println("Sildi.");
		}
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	
	public static int topla(int a, int b) {
		int sum = 0;
		sum  = a+b;
		return sum;
	}
	public static int topla2(int... sayilar) { //integer array gönderilmiþ gibi oldu.
		int sum=0;
		for(int sayi:sayilar) {
			sum += sayi; 
		}
		return sum;
	}
	

}
