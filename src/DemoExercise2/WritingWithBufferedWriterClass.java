package DemoExercise2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingWithBufferedWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assigning the file content
        // Note: Custom contents taken as input to
        // illustrate
        String text
            = "I have this text written in my desktop notepad demo2.txt";
 
        // Try block to check for exceptions
        try {
 
            // Step 1: Create an object of BufferedWriter
            BufferedWriter f_writer
                = new BufferedWriter(new FileWriter(
                    "/Users/afreen.khan/Desktop/demo2.docx"));
 
            // Step 2: Write text(content) to file
            f_writer.write(text);
 
            // Step 3: Printing the content inside the file
            // on the terminal/CMD
            System.out.print(text);
 
            // Step 4: Display message showcasing
            // successful execution of the program
            System.out.print(
                "File is created successfully with the content.");
 
            // Step 5: Close the BufferedWriter object
            f_writer.close();
        }
 
        // Catch block to handle if exceptions occurs
        catch (IOException e) {
 
            // Print the exception on console
            // using getMessage() method
            System.out.print(e.getMessage());
        }
		
	}

}
