package Inheritance;

public class KrediUI {
	public void KrediHesaplaa(OgretmenKrediManager hoca) {
		OgretmenKrediManager hoca1 = new OgretmenKrediManager();
		hoca1.hesapla();
	}
	public void KrediHesapla(BaseKrediManager baseKrediManager) {  //BaseKrediManager di�erlerinin annesi oldu�u i�in direkt bunu yazarak da eri�iriz di�er elemanlara. (Polimorphism)
		baseKrediManager.hesapla();
	}
	
}
