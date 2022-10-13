package DemoExercise1;

public class StringUsecase {
	public static void main(String[] args) {
	       String x = "abc";
	       String y = "abc";

	       System.out.println(x == y);
	       System.out.println(x.equals(y));

	       String z = new String("abc");

	       System.out.println(x == z);
	       System.out.println(x.equals(z));
	       System.out.println(z);
	       System.out.println(x);
	   }

}
