package ExceptionalHandlig;

public class StringIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello how are you";
	      for(int i=0; i<str.length(); i++) {
	         System.out.println(str.charAt(i));
	      }
	      System.out.println(str.length());
	      //Accessing element at greater than the length of the String
	      try {
	         System.out.println(str.charAt(40));
	      }catch(StringIndexOutOfBoundsException e) {
	         System.out.println("Exception occurred . . . . . . . . ");
	      }
	}

}
