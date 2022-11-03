package ExceptionalHandlig;

public class ArithmeticExcption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try  
        {  
        int data=50/0; //may throw exception   
                         // if exception occurs, the remaining statement will not execute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
		System.out.println();
		System.out.println("***************");
		System.out.println();
		try  
        {  
        int data=50/0; //may throw exception   
        }  
             // handling the exception  
        catch(Exception e)  
        {  
                  // displaying the custom message  
            System.out.println("Can't divided by zero");  
        }  
		
		
	}

}
