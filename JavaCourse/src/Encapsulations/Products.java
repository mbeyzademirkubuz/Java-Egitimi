package Encapsulations;

public class Products {
	
	public Products(int id, String name, String description, int price) {  //Constructor class ismi ile ayný olmalýdýr. Ýçerisine parametre alýr ve new ile kullanýldýðýnda o parametre deðerleri girilmelidir. 
		System.out.println("Yapýcý çalýþtý.");
		this._id = id;
		this._name= name;
		this._description= description;
		this._price= price;
	}
	
	public Products() {
		
	}
	
	//Alttaki gibi tek tek yazmak yerine constructor ile tek seferde yazabiliriz.
	

	int _id;  // private int id yapsaydýk tanýmlandýðý blok içerisinde geçerli demektir. Baþka bir class içerisinde kullanamazdýk. 
	private String _name;
	private String _description;
	private int _stockAmount;
	private int _price;

	private String _kod; // kod read only yapýlmak istendiðinde, yani kullanýcýnýn bir giriþ saðlamasýný istemediðimizde Encapsulaiton kullanýlýr. Getter-Setter
	
	//getter
	public int getId() {   //id deðerini okuyabilir.
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
	
	
	//Refactor metodu ile hepsi hýzlýca getirilir. Encapsulate Field diyerek Getter ve Setter'lar getirilir. 
	
}
