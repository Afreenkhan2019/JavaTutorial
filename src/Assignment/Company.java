package Assignment;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpDetail emp= new EmpDetail("Ajay", "Java");
		Project pr= new Project();
		pr.setProject(" Marvel project ");

		pr.EmpProject();

		emp.seteName("Mohan");
		emp.seteTech("Oracle");
		
		//System.out.println(emp.geteName()+"  "+emp.geteTech());
		emp.showEmpdetail();
		
		
	}
	
}
