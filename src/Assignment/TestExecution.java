package Assignment;


public class TestExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= new Animal();
		Dog d= new Dog();
		Cat c= new Cat();
		a.eat();
		a.run();
		
		d.run();
		d.eat();
		c.run();
		c.eat();
		
		//Non Encapsulated Program(we can directly set and get names no need to create setter and getter methods)
		Student s= new Student("Ajay");
		s.name="Mohit";
		s.name="Arun";
		System.out.println(s.name);
		//System.out.println(s.getName());
		
		//Encapsulated class 
		Employee e= new Employee("Nandan");
		//System.out.println(e.name);// since it is encapsulated so not printing the name directly
			
		System.out.println(e.getEmpName());
		
		e.setEmpName("Raghav");
		System.out.println(e.getEmpName());
	}

}
