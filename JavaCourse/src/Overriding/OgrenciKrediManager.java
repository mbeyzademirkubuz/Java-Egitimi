package Overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar* 1.10;
	}
	
	
	/* 
	 * Burada ana hesaplama (tutar * 1.18) iken overriding i�lemi ile ��renci kredisinin hesab�n� de�i�tirdik. Base i�erisinde olan i�lem override edildi.
	 * final anahtar kelimesi kullan�larak override i�lemi yap�lmas�na engel oluruz. 
	 * BaseKrediManager'da hesapla metoduna final eklersek bu i�lemi yapamay�z.
	 */
}
