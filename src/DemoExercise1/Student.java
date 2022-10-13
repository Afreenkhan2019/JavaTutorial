package DemoExercise1;

public class Student {

	   private String firstName, lastName;
	   private String email;
	   private String cnp;

	   public Student(String firstName, String lastName, String email, String cnp) {
	       this.firstName = firstName;
	       this.lastName = lastName;
	       this.email = email;
	       this.cnp = cnp;
	   }
	   
	   public String toString() {


		   String t ="This student's name is "+firstName +" "+ lastName+",CNP" +cnp+
				   ". You can contact the student on this email "+email;
		   	

		   return t;
	   }
	   
	   


	   public static void main(String[] args) {
	       Student student = new Student("Gheorghe", "Popescu", "gheorghe.popescu@gmail.com", "1121282123456");

	       System.out.println(student);

	       Student student2 = new Student("Gheorghe", "Popescu", "gheorghe.popescu@gmail.com", "1121282123456");

	       System.out.println(student == student2);

	       System.out.println(student.equals(student2));
	   }
	}





