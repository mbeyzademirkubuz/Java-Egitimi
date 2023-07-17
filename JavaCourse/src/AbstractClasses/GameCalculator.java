package AbstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); 
	
	/*
	 * GameCalculator kullanan her class gameOver'ý kullanmak zorundadýr ama abstract yaptýðýmýz için hesapla metodu yalnýzca belirtilen classlarda kullanýlýr. 
	 * Kullanmak için override etmeli.
	 * abstract classýn abstract alt classý olmasý zorunlu deðildir. 
	 */
	
	public void gameOver() {
		System.out.println("Game over!");
	}
}
