package AbstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); 
	
	/*
	 * GameCalculator kullanan her class gameOver'� kullanmak zorundad�r ama abstract yapt���m�z i�in hesapla metodu yaln�zca belirtilen classlarda kullan�l�r. 
	 * Kullanmak i�in override etmeli.
	 * abstract class�n abstract alt class� olmas� zorunlu de�ildir. 
	 */
	
	public void gameOver() {
		System.out.println("Game over!");
	}
}
