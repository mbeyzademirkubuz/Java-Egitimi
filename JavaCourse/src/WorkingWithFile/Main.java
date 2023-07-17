package WorkingWithFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getFileInfo();
		readFile();
		writeFile();
		readFile();
	}
		
		public static void createFile(){
			File file = new File("C:\\Users\\beyza\\OneDrive\\Masa�st�\\JavaEgitimi\\JavaCourse\\src\\files\\students.txt");
			try {
				if(file.createNewFile()) {
					System.out.println("Dosya olu�turuldu.");
				}
				else {
					System.out.println("Dosya zaten mevcut.");

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		public static void getFileInfo() {
			File file = new File("C:\\Users\\beyza\\OneDrive\\Masa�st�\\JavaEgitimi\\JavaCourse\\src\\files\\students.txt");
			if(file.exists()) {
				System.out.println("Dosya ad�: " + file.getName());
				System.out.println("Dosya yolu: " + file.getAbsolutePath());
				System.out.println("Dosya yaz�labilir mi?: " + file.canWrite());
				System.out.println("Dosya okunabilir mi?: " + file.canRead());
				System.out.println("Dosya boyutu: (byte) " + file.length());
			}

		}
		
		public static void readFile() {
			File file = new File("C:\\Users\\beyza\\OneDrive\\Masa�st�\\JavaEgitimi\\JavaCourse\\src\\files\\students.txt");
			try {
				Scanner reader = new Scanner(file);
				while(reader.hasNextLine()) {
					String line = reader.nextLine();
					System.out.println(line);
				}
				reader.close(); // dosyay� kapatmak �nemlidir.
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void writeFile() {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\beyza\\OneDrive\\Masa�st�\\JavaEgitimi\\JavaCourse\\src\\files\\students.txt", true));
				writer.newLine();
				writer.write("Mira�");
				System.out.println("Dosyaya yaz�ld�.");
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
