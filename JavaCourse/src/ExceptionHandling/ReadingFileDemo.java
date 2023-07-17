package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingFileDemo {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\beyza\\OneDrive\\Masaüstü\\JavaEgitimi\\JavaCourse\\src\\ExceptionHandling\\sayilar.txt"));
	}
	
}
