package Assignment;


import java.util.*;
public class ArrayEmployeeExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name;
		String tech1;
		String tech2;
		String project;
		
		System.out.println("Enter the number of project");
		int numberOfProjects = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the number of Employees in project");
		int numberOfEmployees = scan.nextInt();
		scan.nextLine(); // <- reads the newline from the console
		ArrayProject[] p= new ArrayProject[numberOfProjects]; 
		ArrayEmpDetail[] E1 = new ArrayEmpDetail[numberOfEmployees];		  
		    
		    for(int j = 0; j <= p.length-1;j++){
		    	int c1= j+1;
		    	
		    	System.out.println("Assigned "  + " project "+ c1 +" :");			    	
		    	project = scan.nextLine();
		    	p[j]= new ArrayProject(project);		    	
		    	p[j].EmpProject();
		    	
		    	
		    	for(int i = 0; i <= E1.length-1; i++){	
		    		int c=i+1;
		    		System.out.println("Enter employee's " + c + " name: ");
				    name = scan.nextLine();		    
				    System.out.println("Enter employee's" + c + " Technology 1: ");
				    tech1 = scan.nextLine();		    			    
				    System.out.println("Enter employee's " + c + " Technology 2: ");
				    tech2 = scan.nextLine();
		    	
				    E1[i] = new ArrayEmpDetail(name, tech1, tech2 );
				    E1[i].showEmpdetail2();
		    	
			    
		    }
		   
		    	
		}
	    
	
	}

}
