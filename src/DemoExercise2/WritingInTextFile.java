package DemoExercise2;
//
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingInTextFile {
	// Main driver method
    public static void main(String[] args)
        throws IOException
    {
        // Assigning the content of the file
        String text
            = "Good luck for java learning!!\nHappy Learning!";
 
        // Defining the file name of the file
        Path fileName = Path.of(
        		"/Users/afreen.khan/Desktop/demo4.txt");//why his format -- FileWriter fWriter = new FileWriter(
        //"/Users/mayanksolanki/Desktop/demo.docx");
      
        // Writing into the file
        Files.writeString(fileName, text);
 
        //Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
    }

}
