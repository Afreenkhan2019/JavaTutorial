package DemoExercise;

public class Circle {
	
	double radius=1.0;
	String color="red";

	public Circle() {
//		this.radius=1.0;
//		this.color="red";
	}
	public Circle(double aRadius) {
		this.radius=aRadius;
		//this.color="Yellow";
	}
	
	public double getRadius() {
		return this.radius;
	}
	public double getArea(double rad) {
		double Area= Math.PI*rad*rad;
		return Area;
	}
}
