package Encapsulations;

public class Products {
	
	public Products(int id, String name, String description, int price) {  //Constructor class ismi ile ayn� olmal�d�r. ��erisine parametre al�r ve new ile kullan�ld���nda o parametre de�erleri girilmelidir. 
		System.out.println("Yap�c� �al��t�.");
		this._id = id;
		this._name= name;
		this._description= description;
		this._price= price;
	}
	
	public Products() {
		
	}
	
	//Alttaki gibi tek tek yazmak yerine constructor ile tek seferde yazabiliriz.
	

	int _id;  // private int id yapsayd�k tan�mland��� blok i�erisinde ge�erli demektir. Ba�ka bir class i�erisinde kullanamazd�k. 
	private String _name;
	private String _description;
	private int _stockAmount;
	private int _price;

	private String _kod; // kod read only yap�lmak istendi�inde, yani kullan�c�n�n bir giri� sa�lamas�n� istemedi�imizde Encapsulaiton kullan�l�r. Getter-Setter
	
	//getter
	public int getId() {   //id de�erini okuyabilir.
		return _id;  
	}
	//setter
	public void setId(int id) {
		_id= id;
	}
	String get_name() {
		return _name;
	}
	void set_name(String _name) {
		this._name = _name;
	}
	String get_description() {
		return _description;
	}
	void set_description(String _description) {
		this._description = _description;
	}
	int get_stockAmount() {
		return _stockAmount;
	}
	void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	int get_price() {
		return _price;
	}
	void set_price(int _price) {
		this._price = _price;
	}
	
	
	//Refactor metodu ile hepsi h�zl�ca getirilir. Encapsulate Field diyerek Getter ve Setter'lar getirilir. 
	
}
