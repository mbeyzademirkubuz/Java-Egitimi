package Strings;

public class Stringss {
	public static void main(String[] args) {
		String message = "Weather is so good.";
		
		System.out.println(message);
		
		System.out.println("\nLength :" + message.length());
		System.out.println("\n5. element :" + message.charAt(4));   //dizi mant��� gibi 0. indexten ba�lar.
		System.out.println(message.concat(" Yeyy!\n"));
		System.out.println(message);   //concat ge�icidir. Eski hali bas�l�r. 
		System.out.println(message.startsWith("A"));
		System.out.println(message.endsWith("."));
		
		char[] chr = new char[5];
		message.getChars(0, 5, chr, 0);
		System.out.println(chr);
		
		System.out.println(message.indexOf('a'));
		System.out.println(message.indexOf("is"));
		
		System.out.println(message.lastIndexOf('a'));
	}
	}

