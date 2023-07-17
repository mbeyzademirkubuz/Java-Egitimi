package Inheritance;

public class KrediUI {
	public void KrediHesaplaa(OgretmenKrediManager hoca) {
		OgretmenKrediManager hoca1 = new OgretmenKrediManager();
		hoca1.hesapla();
	}
	public void KrediHesapla(BaseKrediManager baseKrediManager) {  //BaseKrediManager diğerlerinin annesi olduğu için direkt bunu yazarak da erişiriz diğer elemanlara. (Polimorphism)
		baseKrediManager.hesapla();
	}
	
}
