package ExceptionalHandlig;

import java.io.*;

public class FileNotFoundExcption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			// creating an instance of the FileReader class
			FileReader fileReader;
			try {
				fileReader = new FileReader("Test.txt");
				// create instance of the BufferedReader and pass the FileReader instance to it.
				BufferedReader bufferReader = new BufferedReader(fileReader);

				// declaring an empty string by passing null value
				String fileData = null;

				// use while loop to read and print data from buffered reader
				try {
					while ((fileData = bufferReader.readLine()) != null) {
						System.out.println(fileData);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("I/o Exception is handeld");
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();;
				System.out.println("Here the File found exception is catched");
			}
		}

	}
}
