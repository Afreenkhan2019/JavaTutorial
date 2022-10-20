package DemoExercise2;

public class Employee1 {

		public String name;
		public String bday;
		public double salary;
		public int overtime;
	public Employee1(String eName,String eBday,double eSalary,int eOvertime) {
		name=eName;
		bday=eBday;
		salary=eSalary;
		overtime=eOvertime;
	}
	

	public void showdata() {
		
		System.out.println(name+"\n"+bday+"\n"+salary+"\n"+overtime);
	}
}
