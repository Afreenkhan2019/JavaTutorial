package DemoExercise2;

import java.io.File;
import java.util.Scanner;


//Java Program to illustrate 
//reading from Text File
//using Scanner Class
public class ReadingUsingScannerClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// pass the path to the file as a parameter
	    File file = new File("C:\\Users\\afreen.khan\\Desktop\\demo4.txt");
	    Scanner sc = new Scanner(file);
	 
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
	}

}
