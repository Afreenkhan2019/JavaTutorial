package DemoExercise2;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print 10 * 10 , 2D matrix 		
		for(int i= 1; i<=10;i++) {
			for(int j= 1; j<=10;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		//Reversing the Digits
		int num= 87698743;
		int reverse=0;
		while(num!=0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		System.out.println(reverse);
		
		
		



	    // Count the number of times a substring appears in string
		String string = " hi abc Hi hi hi hi hi hi he hi ";
		String word = "hi";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (word.equals(temp[i]))
		count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");

		
		//
		
		       String x = "abc";
		       String y = "abc";

		       System.out.println(x == y);
		       System.out.println(x.equals(y));

		       String z = new String("abc");

		       System.out.println(x == z);
		       System.out.println(x.equals(z));	
		       
		       
		       
		       
		       
		       
		       
		      
	}
	

}
