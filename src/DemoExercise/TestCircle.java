package DemoExercise;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c= new Circle();
		System.out.println("Radius of Circle is : "+c.radius+
				 " Color of circle is : "+c.color);
	
	
		Circle c1= new Circle(2.0);
		System.out.println("Radius of Circle is : "+c1.radius+
				 " Color of circle is : "+c.color);
		
		System.out.println(c.getRadius());
		System.out.println(c.getArea(7));
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea(2));
	}

}
