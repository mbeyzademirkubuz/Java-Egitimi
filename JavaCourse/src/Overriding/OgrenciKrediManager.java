package Overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar* 1.10;
	}
	
	
	/* 
	 * Burada ana hesaplama (tutar * 1.18) iken overriding iþlemi ile öðrenci kredisinin hesabýný deðiþtirdik. Base içerisinde olan iþlem override edildi.
	 * final anahtar kelimesi kullanýlarak override iþlemi yapýlmasýna engel oluruz. 
	 * BaseKrediManager'da hesapla metoduna final eklersek bu iþlemi yapamayýz.
	 */
}
