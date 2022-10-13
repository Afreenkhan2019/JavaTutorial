package DemoExercise;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1 = new Author("Bruce Eckel","bruce.eckel@gmail.com","male");
		
//		a1.setName("Bruce Eckel");
//		a1.setEmail("bruce.eckel@gmail.com");
//		a1.setGender("male");
		
		Author a2 = new Author("Bruce Eckel","bruce.eckel@gmail.com","male");
//		a2.setName("Bruce Eckel");
//		a2.setEmail("bruce.eckel@gmail.com");
//		a2.setGender("male");

		Author a3 = new Author("aaan","ddd@gmail.com","female");
		a3.setName("Robert Cecil Martin");
		a3.setEmail("robert.cecil@gmail.com");
		a3.setGender("male");
		// 
		
		Book b1 = new Book();
		b1.name="Thinking in Java";		
		b1.price=10;
		b1.quantity=10;		
		
		Book b2 = new Book();
		b2.name="Thinking in Patterns in Java";		
		b2.price=10;
		b2.quantity=2;
		
		Book b3 = new Book();
		b3.name="Clean Code";
		b3.price=15;
		b3.quantity=0;
		
		System.out.println("Name= "+b1.name+", Author = "
				+ "("+a1.getName()+" , "+a1.getEmail()+" , "+a1.getGender()+
				"),Price = "+b1.price+" Quantity = "+b1.quantity);
		
		System.out.println("Name= "+b2.name+", Author = "
				+ "("+a2.getName()+" , "+a2.getEmail()+" , "+a2.getGender()+
				"),Price = "+b2.price+" Quantity = "+b2.quantity);
		
		System.out.println("Name= "+b3.name+", Author = "
				+ "("+a3.getName()+" , "+a3.getEmail()+" , "+a3.getGender()+
				"),Price = "+b3.price+" Quantity = "+b3.quantity);
	
	}
	

}
