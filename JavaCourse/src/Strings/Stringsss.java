package Strings;

public class Stringsss {

	public static void main(String[] args) {
		String message = "Weather is so good.";
		
		System.out.println(message);
		System.out.println(message.replace(' ', '-'));  //eski halini bozmaz. Anlýk görüntü.
		System.out.println(message);
		
		String newMes = message.replace(' ', '-');
		System.out.println(newMes);
		
		System.out.println(message.substring(2)); //2.indexinden sonrakini parçalar. 
		System.out.println(message.substring(2,8));
		
		for (String word:message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());

		
	}

}
